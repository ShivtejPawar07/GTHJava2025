/* WAP to create Vector and store 5 Book in it and search book by using its id
*/
package org.tech;

public class Book
{
  private int id;
  private String name;
  private String author;
  
  public Book(){
  }
  public Book(int id,String name,String author)
  {  this.id=id;
     this.name=name;
	 this.author=author;
  }
  public void setId(int id)
  { this.id=id;
  }
  public int getId()
  { return id;
  }
  public void setName(String name)
  { this.name=name;
  }
  public String getName()
  { return name;
  }
  public void setAuthor(String author)
  { this.author=author;
  }
  public String getAuthor()
  { return author;
  }
}
