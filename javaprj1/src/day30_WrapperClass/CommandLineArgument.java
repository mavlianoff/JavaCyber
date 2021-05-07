package day30_WrapperClass;

public class CommandLineArgument {
	
	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			
			System.out.println(args[i]);
		}
	}

}

/*HOW TO CALL MAIN METHOD?
Step1: copy complete method code including public class
Step2: paste code to code/text editor (Sublime, Visual Studio, etc)
Step3: save the file as .java on dir/desktop
Step4: compile .java in Shell or Prompt 'javac className.java'   ==> idea is to convert code to machine language
Step5: run the generated class document in Shell or Prompt as 'java className string1, string2, string3, etc'
*/
