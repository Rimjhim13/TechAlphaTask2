class task2{
public static void main(String arg[]){
int i;
int j=0;
int d=2;
int x[]={1,2,3,4,5,6,7};
int y[]=new int [7];

for(i=d;i<7;i++){
	y[j++]=x[i];
}
for(i=0;i<d;i++){
	y[j++]=x[i];
}
for(j=0;j<7;j++){
	System.out.println(y[j]+" ");
}
}
}