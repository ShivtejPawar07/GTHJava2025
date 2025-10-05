#Write a java program to check Number Is Prime Number or Not.

n=int(input("Enter a Number"));

for i in range(2,n/2):
	if(n%i==0):
		print("NOt");
print("prime")
	