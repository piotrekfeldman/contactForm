let email = document.getElementById("email");
const regex = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/g
email.onkeyup = function () {

    if (email.value.match(regex)) {
        document.querySelector("#message").style.display = "none";
        mailValidation.classList.add("invalid");
    } else {
        document.querySelector("#message").style.display = "block";
    }
}