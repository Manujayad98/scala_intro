object caseclass extends App{
	
	val p1=Point(3,5)
	val p2=Point(1,2)
	println("First point :"+p1+"\nSecond point:"+p2+"\n")

	println("Sum of two points :"+(p1+p2))
	println("Move first point by 1 and 3 :"+p1.move(1,3))
	println("Distance between these two points :"+ p1.distance(p2))
	println("Inverse of the first point :"+p1.invert) 

}
case class Point(a:Int,b:Int){

	def x:Int=a
	def y:Int=b
	def +(p:Point)=Point(this.x+p.x,this.y+p.y)
	def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
	def distance(p:Point)=math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y))
	def invert=Point(this.y,this.x)
}