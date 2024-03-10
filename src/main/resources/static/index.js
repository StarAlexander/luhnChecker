for (const input of document.getElementsByTagName("input")) {
    input.oninput = () => {
        if (input.value.length > 4) {
            input.value  = input.value.slice(0,4)
        }
    }
}


document.getElementById("verify").onclick = async () => {
    const card = document.getElementById("card")
    let str = ""
    for (const input of document.getElementsByTagName("input")) {
        str = str + input.value
    }
    const data = await fetch("http://localhost:8080/validate/"+str)
    const json = await data.json()
    if (json == true) {
    card.classList.remove("invalid-card")
    card.classList.add("valid-card");
    }
    else {
    card.classList.remove("valid-card")
    card.classList.add("invalid-card")
    }


}