function validateForm() {
    const username = document.getElementById("username").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirm-password").value;
    const mobileNumber = document.getElementById("mobile-number").value;
    const gender = document.querySelector('input[name="gender"]:checked');

    if (username === "") {
      alert("Username can not be empty.");
      return false;
    }

    if (password === "") {
      alert("Password can not be empty.");
      return false;
    }

    if (email === "") {
          alert("Email can not be empty.");
          return false;
        }

    if (password !== confirmPassword) {
      alert("Passwords does not match");
      return false;
    }

    if (mobileNumber === "") {
      alert("Mobile number can not be empty.");
      return false;
    }

    if (!gender) {
      alert("Gender can not be empty.");
      return false;
    }

    if (confirmPassword === "") {
          alert("Confirm password can not be empty.");
          return false;
        }
  }
