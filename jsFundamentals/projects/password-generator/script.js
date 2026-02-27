const submit = document.getElementById("submit");

submit.onclick = function generatePw(e) {
    e.preventDefault();
    
    const result = document.getElementById("result");
    const lengthOfPw = Number(document.getElementById("lengthOfPw").value);
    const includeLowercase = document.getElementById("lowerCase");
    const includeUppercase = document.getElementById("upperCase");
    const includeNum = document.getElementById("includeNum");
    const includeSymbol = document.getElementById("includeSymbol");

    const lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
    const uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const nums = "0123456789";
    const symbols = "!@#$%^&*_+";

    let password = "";
    let allowChars = "";

    if (lengthOfPw < 3 || lengthOfPw > 15) {
        result.textContent = "Your password should be at least 3 characters and less than 16"; 
        return;
    }
    
    if (includeLowercase.checked) {
        allowChars += lowercaseChars;        
    }
    if (includeUppercase.checked) {
        allowChars += uppercaseChars;
    }
    if (includeNum.checked) {
        allowChars += nums;
    }
    if (includeSymbol.checked) {
        allowChars += symbols;
    }
    
    if (allowChars === "") {
        result.textContent = "Choose at least one from above to be included in your password";
        return;
    }


    for (let i = 0; i < lengthOfPw; i++) {
        const randomIndex = Math.floor(Math.random() * allowChars.length);
        password += allowChars[randomIndex];
    }
    console.log(password);
    
    result.textContent = `Here's your password: ${password}`;

}