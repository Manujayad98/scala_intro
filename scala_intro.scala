object scala_intro extends App{

  def convert(x:Double)=x*1.8+32;
    println(convert(35));

  def volume(x:Double)=((4/3)*(22/7)*(x*x*x));
      println(volume(5));

  def cost(x:Double)=x*(24.95*60)/100+3+(x-50)*0.75;
  println(cost(60));

}    
