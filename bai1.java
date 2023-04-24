package Chuong1;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public class Vehicle {
		private int maXe,dungTich;
		private double triGia;
		private String chuXe, moTa;
		Scanner scan = new Scanner(System.in);

		public Vehicle (int maXe, int dungTich, double triGia, String chuXe, String moTa) {
			this.maXe=maXe;
			this.dungTich=dungTich;
			this.triGia=triGia;
			this.chuXe=chuXe;
			this.moTa=moTa;
			
			
				
	
		}
		public Vehicle() {
			
		}
		public int geMaXe(){
			return maXe;
		}
		public void setmaXe(int maXe) {
			this.maXe=maXe;
		}
		public int getdungTich() {
			return dungTich;
		}
		public void setdungTich(int dungTich) {
			this.dungTich=dungTich;
		}
		public Double gettriGia() {
			return triGia;
		}
		public void settriGia(double triGia) {
			this.triGia=triGia;
		}
		public String getchuXe() {
			return chuXe;
		}
		public void setchuXe(String chuXe) {
			this.chuXe=chuXe;
		}
		public String getmoTa() {
			return moTa;
		}
		public void setmoTa(String moTa) {
			this.moTa=moTa;
		}
		public double tinhThue() {
			double thue;
			if(dungTich<100)
				thue=triGia*0.01;
			else if (dungTich>=100 && dungTich<=200) thue=triGia*0.03;
			else thue=triGia*0.05;
			return thue;
				}
		@Override
		public  String toString(){
			return maXe + "-"+ chuXe + "-"+dungTich+ "-"+triGia + "-"+moTa;
				
		}
		void inThue() {
			System.out.printf("%5d%-20s %5d %10.2f%10s%8.5f\n","Ma Xe La: " + maXe + "Chu Xe La: "+ chuXe + "Dung Tich La: "+ dungTich,"Tri Gia La: " + triGia,"Mo Ta: "+ moTa,tinhThue());
			
		}
		
		
	}
	
		}
	




