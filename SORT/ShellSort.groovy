class ShellSort {
 
public void sort(int[] numbers) {
int h = 1;
int len = numbers.length;
while(h < len) {
h = (3 * h) + 1;
}
 
while(h > 0) {
for(int i = h; i < len; i++) {   
for(int j = i; j >=h && numbers[j] < numbers[j-h]; j -= h) {
int temp = numbers[j-h];   
numbers[j-h] = numbers[j];   
numbers[j] = temp;
}
}
h = h / 3;
}
}
}
 
int[] numbers = new int[20];
 
for(int i = 0; i < numbers.length; i++) {
numbers[i] = (int)(Math.random() * 100);
}
 
new ShellSort().sort(numbers);
 
for(int i = 0; i < numbers.length; i++) {
System.out.println(numbers[i]);
}
