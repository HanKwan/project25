const submit = document.getElementById("submit");
// const form = document.getElementById("values");


submit.onclick = function generatePw(e) {
    e.preventDefault();
    
    const result = document.getElementById("result");
    const lengthOfPw = document.getElementById("lengthOfPw").value;
    const lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
    const includeLowercase = document.getElementById("lowerCase");

    let password = "";
    let allowChars = "";

    if (includeLowercase.checked) {
        allowChars += lowercaseChars;        

        for (let i = 0; i < lengthOfPw; i++) {
            const randomIndex = Math.floor(Math.random() * allowChars.length);
            password += allowChars[randomIndex];
        }
    }
       
    console.log(password);
   
}