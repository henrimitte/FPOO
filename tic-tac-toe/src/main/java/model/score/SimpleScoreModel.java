package model.score;

public class SimpleScoreModel implements ScoreModel {

	private int scoreX = 0;
	private int scoreO = 0;

	@Override
	public int scoreX() {
		return this.scoreX;
	}

	@Override
	public int scoreO() {
		return this.scoreO;
	}

	@Override
	public void incScoreX() {
		this.scoreX++;
	}

	@Override
	public void incScoreO() {
		this.scoreO++;
	}

	@Override
	public void reset() {
		this.scoreX = this.scoreO = 0;
	}

}
