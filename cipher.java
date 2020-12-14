Scanner scanner = new Scanner(System.in);
String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
ArrayList<String> message = new ArrayList<String>();
List<String> arrCheck = Arrays.asList(letters);
System.out.println("e/d?");
String eOrD = scanner.nextLine();
System.out.println("#-1+25?");
int shift = scanner.nextInt();
System.out.println("Message?");
String msg = scanner.nextLine();
int le = msg.length();
String encrypted = "a";
int i = 0;
if(eOrD.equalsIgnoreCase("e")){
	for(int a1 = 0; a1 < le; a1++){
		char letN = msg.charAt(a1);
		if(arrCheck.contains(" ")){
			message.add(" ");
    }
    if(arrCheck.contains(letN)){
     	int index = -1;
     	for (i = 0; i < letters.length; i++) {
       	if (letters[i].equals(letN)){
         		index = i;
         		break;
       	}
    	}
     	index = index + shift;
     	if(index > 25){
       	for(int a2 = 0;a2 < shift; a2++){
      		if(index + shift > 25){
         		index = i;
       			for(int a3 = 0; a3 < shift; a3++){
       				index = index + 1;
     					if(index == 25){
      					index = 0;
     					}
     				}
   				}
   			}
 			}
			encrypted = letters[index];
			message.add(encrypted);
 			System.out.println(message);
 		}
	}
}
