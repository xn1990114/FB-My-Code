package design_2048Game;
/*
 * see below link or google for detail
 * http://2048game.com
 */
public class Board {
	int[][] board;
	public Board(){
		this.board=new int[4][4];
	}
	public void initialize(){
		addElement();
		addElement();
	}
	// direction 0-left,1-right,2-up,3-down
	public void update(int direction){
		if(direction==0){
			for(int i=0;i<4;i++){
				int last=-1;
				int index=0;
				for(int j=0;j<4;j++){
					if(board[i][j]==0){
						continue;
					}
					if(last==-1){
						last=board[i][j];
					}
					else if(board[i][j]!=last){
						board[i][index]=last;
						index++;
						last=board[i][j];
					}
					else{
						board[i][index]=last+last;
						index++;
						last=-1;
					}
					
				}
				while(index<4){
					if(last!=-1){
						board[i][index]=last;
						last=-1;
					}
					else{
						board[i][index]=0;
					}
					index++;
				}
			}
		}
		else if(direction==1){
			for(int i=0;i<4;i++){
				int last=-1;
				int index=3;
				for(int j=3;j>=0;j--){
					if(board[i][j]==0){
						continue;
					}
					if(last==-1){
						last=board[i][j];
					}
					else if(board[i][j]!=last){
						board[i][index]=last;
						index--;
						last=board[i][j];
					}
					else{
						board[i][index]=last+last;
						index--;
						last=-1;
					}
				}
				while(index>=0){
					if(last!=-1){
						board[i][index]=last;
						last=-1;
					}
					else{
						board[i][index]=0;
					}
					index--;
				}
			}
		}
		else if(direction==2){
			for(int j=0;j<4;j++){
				int last=-1;
				int index=0;
				for(int i=0;i<4;i++){
					if(board[i][j]==0){
						continue;
					}
					if(last==-1){
						last=board[i][j];
					}
					else if(board[i][j]!=last){
						board[index][j]=last;
						index++;
						last=board[i][j];
					}
					else{
						board[index][j]=last+last;
						index++;
						last=-1;
					}
					
				}
				while(index<4){
					if(last!=-1){
						board[index][j]=last;
						last=-1;
					}
					else{
						board[index][j]=0;
					}
					index++;
				}
			}
		}
		else if(direction==3){
			for(int j=0;j<4;j++){
				int last=-1;
				int index=3;
				for(int i=3;i>=0;i--){
					if(board[i][j]==0){
						continue;
					}
					if(last==-1){
						last=board[i][j];
					}
					else if(board[i][j]!=last){
						board[index][j]=last;
						index--;
						last=board[i][j];
					}
					else{
						board[index][j]=last+last;
						index--;
						last=-1;
					}
				}
				while(index>=0){
					if(last!=-1){
						board[index][j]=last;
						last=-1;
					}
					else{
						board[index][j]=0;
					}
					index--;
				}
			}
		}
		addElement();
	}
	public void addElement(){
		int countEmpty=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(board[i][j]==0){
					countEmpty++;
				}
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(board[i][j]==0){
					int ran=(int)(Math.random()*countEmpty);
					if(ran==0){
						board[i][j]=2;
						return;
					}
					countEmpty--;
				}
			}
		}
	}
	
	public boolean checkGameOver(){
		for(int i=0;i<4;i++){
			int[] lastVertical=new int[4];
			int[] lastHorizonal=new int[4];
			for(int j=0;j<4;j++){
				if(lastVertical[i]==board[j][i]){
					return false;
				}
				else{
					lastVertical[i]=board[j][i];
				}
				if(lastHorizonal[i]==board[i][j]){
					return false;
				}
				else{
					lastHorizonal[i]=board[i][j];
				}
			}
		}
		return true;
	}
	public void display(){
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(board[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
