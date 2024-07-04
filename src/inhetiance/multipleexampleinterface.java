package inhetiance;
class mother1{
	int i=9;
}
class mother2{
	int i=99;
}
class child98 extends mother1,mother2// its an error we canot inherit child class from two parents it's not 
//possible in real world same as not possible in java
{ 
	System.out.println(i);
}

public class multipleexampleinterface {

}
