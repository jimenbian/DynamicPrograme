

public class Main {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub        		
		final int packageWheight=10;//��������
		Package[] pg={
		   new Package(6,2,"a"),
		   new Package(3,2,"b"),
		   new Package(5,6,"c"),
		   new Package(4,5,"d"),
		   new Package(6,4,"e")		   
		};
		
		int[][] bestValues = new int[pg.length+1][packageWheight+1];
	
		for(int i=0;i<=pg.length;i++){
			for(int j=0;j<=packageWheight;j++){
				if(i==0||j==0){
					bestValues[i][j]=0;//�ٽ����
				}
				else{
					if(j<pg[i-1].getWheight()){
						bestValues[i][j] = bestValues[i-1][j];//����n����Ʒ�������ڰ�������ʱ�����ֵȡǰn-1����
					}
					else{
						   int iweight = pg[i-1].getWheight(); //����n����Ʒ����С�ڰ�������ʱ��������������ֱ���װ��n����װ���Ƚ�ȡ���
	                        int ivalue = pg[i-1].getValue();    
	                        bestValues[i][j] =     
	                            Math.max(bestValues[i-1][j], ivalue + bestValues[i-1][j-iweight]);          
					}
				}
			}
		}
		
		System.out.print(""+bestValues[pg.length][packageWheight]);
		}
	}


