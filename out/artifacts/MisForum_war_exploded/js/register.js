function check() {
    var userName = document.getElementById("userName").value;
    var password = document.getElementById("password").value;
    var userEmail = document.getElementById("userEmail").value;
    var userSex = document.getElementById("userSex").value;
    if (userName == ""){
        alert("用户名为空！");
        document.getElementById("userName").focus();
        return false;
    }

    var patten = /^[a-zA-Z]\w{3,15}$/g;
    if(!patten.test(userName)) {
        alert("请输入正确的用户名！");
        document.getElementById("userName").focus();
        return false;
    }

    var reg = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
    var isok = reg.test(userEmail);
    if (!isok){
        alert("邮箱格式错误！请重新输入！");
        document.getElementById("userEmail").focus();
        return false;
    }

    var patrn=/^(\w){6,20}$/;
    if (!patrn.test(password)){
        alert("密码含有非法字符，请重新输入！");
        document.getElementById("password").focus();
        return false;
    }

    if (password == ""){
        alert("密码不能为空！");
        document.getElementById("password").focus();
        return false;
    }

}