import scala.io.StdIn;
object ceasar_cipher{
	def main(args:Array[String]){
		val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		val key=1
		val s=readLine("Enter the the word(pain text) to encrypt or decrypt:")
		println("1.Encrypt\n2.Decrypt\nEnter the choice :")
		val i= readInt()
		if(i==1)
			println(cipher(encrypt,s,key,alphabet))
		if(i==2)
			println(cipher(decrypt,s,key,alphabet))
	}

	val encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
	val decrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
	
	val cipher=(fun:(Char,Int,String)=>Char,txt:String,key:Int,a:String)=>txt.map(fun(_,key,a))
}
