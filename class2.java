class box0 {
float length;
float width;
float height;
void volume() {
System.out.println("Volume is : "+length*width*height);
}
void dim(){
System.out.println("Dimensions are :"+length +" "+width+" "+height);
}
void setdim(float l, float w, float h)

{
length= l;
width=w;
height=h;
}
}

class class2{
public static void main (String ar[]){
box0 b1= new box0();
box0 b2= new box0();
box b3= new box();
box b4= new box(10,8,4);
b1.length=10;
b1.width=7;
b1.height=4;
b2.setdim(8,5,3);
b1.volume();
b2.dim();
b3.volume();
b4.volume();
}
}