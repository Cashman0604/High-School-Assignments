
public class Book {
	private String title;
	private String author;
	private String illustrator;
	private int pgCnt;
	public Book(){
		title="";
		author="";
		illustrator="";
		pgCnt=0;
	}
	public Book(String title,String author,int pgCnt, String illustrator){
		this.title=title;
		this.author=author;
		this.illustrator=illustrator;
		this.pgCnt=pgCnt;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}	
	public String getIllustrator(){
		return illustrator;
	}
	public int getPgCnt(){
		return pgCnt;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public void setIllustrator(String illustrator){
		this.illustrator=illustrator;
	}
	public void setPgCnt(int pgCnt){
		this.pgCnt=pgCnt;
	}
	public String toString(){
		String illus=" and was illustrated by "+illustrator;
		if(illustrator.equals("")){
			illus="";
		}
		return"The book "+title+" was written by "+author+" with "+pgCnt+" pages"+illus+".";
	}
}
