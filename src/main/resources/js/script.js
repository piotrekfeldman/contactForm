let email = document.getElementById("email");
const regex = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/g
var specialCharacters = /[\!\@\#\$\%\^\&\*\)\(\+\=\.\<\>\{\}\[\]\:\;\'\"\|\~\`\_\-]/g

email.onkeyup = function () {

    if (email.value.match(specialCharacters)) {
        document.querySelector("#message").style.display = "block";
        letter.classList.add("invalid");
    } else {
        document.querySelector("#message").style.display = "none";
    }
    if (email.value.match("a")) {
        document.querySelector("#message").style.display = "block";
        letter.classList.add("invalid");
    }
}