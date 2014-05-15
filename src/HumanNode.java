
public class HumanNode {

	private int Id;
	private int distance;

	HumanNode(int id){
		this.Id = id;
		this.distance = 0;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		Id = id;
	}
	/**
	 * @return distance
	 */
	public int getDistance() {
		return distance;
	}
	/**
	 * @param distance セットする distance
	 */
	public void setDistance(int distance) {
		this.distance = distance;
	}



}
