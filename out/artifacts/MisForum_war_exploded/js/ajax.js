//声明XMLHttpRequest对象
var xmlHttpRequest = null;
//创建XMLHttpRequest对象实例的方法
function creatXHR() {
    try {
        xmlHttp_request = new XMLHttpRequest();
    }catch (e1) {
        var _msxmlhttp = new Array("Msxml2.XMLHTTP.6.0","Msxml2.XMLHTTP.5.0","Msxml2.XMLHTTP.4.0","Msxml2.XMLHTTP.3.0","Msxml2.XMLHTTP","Microsoft.XMLHTTP");
        for (var i = 0;i <_msxmlhttp.length;i++){
            try{
                xmlHttprequest = new ActiveXObject(_msxmlhttp[i]);
                if (xmlHttprequest = null){break;}
            }catch (e2) {

            }
        }
    }
    if (xmlHttprequest == null){
        alert("不能创建Ajax对象！");
    }

}
//发送客户端的请求，该方法有4个参数，其中method取值为POST或GET
function sendRequest(url,params,method,handler) {
    creatXHR();
    if (!xmlHttpRequest)return false;
    xmlHttpRequest.onreadystatechange = handler; //指定相应函数为handler
    if (method == "GET"){
        xmlHttpRequest.open(method,url+'?'+params,true);
        xmlHttpRequest.send(null);
    }
    if (method == "POST"){
        xmlHttpRequest.open(method,url,true);
        xmlHttpRequest.setRequestHeader("Content-type","application/x-www-form-urlencoded");
        xmlHttpRequest.send(params);
    }


}
