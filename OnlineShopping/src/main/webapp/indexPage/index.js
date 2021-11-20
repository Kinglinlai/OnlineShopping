var currentClass = 0;
var GLOBALclassList = getClasslist();
var GLOBALitemList = getItemlist();



//API
function getPrice(name){
    //Return price of item
    //TODO
    return(20); //TEST ONLY
}

function getUsername(){
    //Return username
    //TODO
    return("TestUser");
}

function getMoneyLeft(Username){
    //Return int for money left
    //TODO
    return(99999);

}

function getClasslist(){
    //Return list of itemClass
    //TODO
    return(["Sword","Spear","Bow"]);
}

function getItemlist(){
    //Return list of items, format:[[Class1 items],[Class2 items]...]
    return([["Sword0","Sword1","Sword2","Sword3","Sword4"],["Spear0","Spear1","Spear2","Spear3","Spear4","Spear5"],["Bow0","Bow1","Bow2","Bow3","Bow4","Bow5"]])
}

function postPurchase(item){
    //Modify the database to log the purchase of item
    //Return true if success, false if failed
    return(true)//TEST ONLY
}

function postSuccess(item,username){
    //Modify database to complete the purchase, deduct points from user
    //Return true if success, false if failed
    return(true);

}

//JAVASCRIPT
function switchTo(int){
    //Change var currentClass to int
    currentClass = int;
    alert("Changed to Number " + int + " Class, which is "+ getClasslist()[int]);
    refreshScreen();
}

function generateClass(list){
    //Return HTML of classes
    var res = "";

    for (var i=0,len=list.length; i<len; i++){ 
        res += '<button class = "descriptiveItemImage" id = "itemImage'+i+'" onclick="switchTo('+i+')">'+ '<img class = "descriptiveImageRound" src="Pics/descriptionOf'+list[i]+'.jpg" >'+ list[i] +'</button>';
    }
    
    return(res);
}

function generateItem(listlist){
    //Return HTML of items in a specific class
    var res = "";

    for (var i=0,len=listlist[currentClass].length; i<len; i++){ 
        res += '<button class = "itemImage"  onclick="buy('+i+','+currentClass+')">'+ '<img class = "imageRound" id = "itemImage'+i+'"  onmouseover="toDetail('+i+','+currentClass+',this)" onmouseout="toNormal('+i+','+currentClass+',this)" src="Pics/'+GLOBALclassList[currentClass]+i+'.jpg" >'+listlist[currentClass][i] +'</button>';
    }

    return res;
    

}

function toDetail(itemIndex,classIndex,obj){
    
    var temp = ("Pics/detail"+GLOBALclassList[classIndex]+itemIndex+".jpg");
    
    obj.src=temp;
    
}

function toNormal(itemIndex,classIndex,obj){
    var temp = ("Pics/"+GLOBALclassList[classIndex]+itemIndex+".jpg")
    obj.src=temp;
}

function buy(itemIndex,classIndex){
    //execute when the customer is buying this one
    //TODO
    //alert("You just bought "+ getItemlist()[currentClass][itemIndex] +" in "+getClasslist()[classIndex]);//TEST ONLY
    res = confirm("Do you wish to buy ["+getItemlist()[currentClass][itemIndex]+"] for "+getPrice(getItemlist()[currentClass][itemIndex])+" Point?")
    if (res == true){
        var result = postPurchase(getItemlist()[currentClass][itemIndex]);
        if (result == true){
            alert("BUY SUCCESS");
            postSuccess(getItemlist()[currentClass][itemIndex],getUsername());
        }else{
            alert("BUY FAILED, because: "+result);
        }
    } else{
        //DO NOTHING
    }
    

    refreshScreen();


}

function refreshScreen(){
    
    //Write all elements
    //TODO
    document.getElementById("username").innerHTML = '<b>USERNAME: </b>'+ getUsername();
    document.getElementById("moneyleft").innerHTML = '<b>MONEYLEFT: </b>'+ getMoneyLeft();
    document.getElementById("itemClass").innerHTML = generateClass(getClasslist());
    document.getElementById("items").innerHTML = generateItem(getItemlist());
    
}

refreshScreen();