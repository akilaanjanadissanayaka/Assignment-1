object Book extends App{
  def price (x:Int):Double=if(x>50) 24.95*x*60/100 +50*3+(x-50)*0.75 
                           else 24.95*x*60/100 +(3*x);
  println(price(60));

}
