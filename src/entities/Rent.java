package entities;

public class Rent {
	private String Nome;
	private String Email;
	private int Room;
	public Rent(String nome, String email, int room) {
		Nome = nome;
		Email = email;
		Room = room;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getRoom() {
		return Room;
	}
	public void setRoom(int room) {
		Room = room;
	}
	
	

}
