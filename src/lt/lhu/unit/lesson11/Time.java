package lt.lhu.unit.lesson11;

public class Time {

	private int houres;
	private int minutes;
	private int seconds;

	public Time() {
		houres = 0;
		minutes = 0;
		seconds = 0;

	}

	public Time(int houres, int minutes, int seconds) {
		if (houres >= 0 && houres <= 23) {
			this.houres = houres;
		} else {
			this.houres = 0;
		}
		if (minutes >= 0 && minutes <= 59) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
		if (seconds >= 0 && seconds <= 59) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}

	public void setHoures(int houres) {
		if (houres >= 0 && houres <= 23) {
			this.houres = houres;
		} else {
			this.houres = 0;
		}
	}

	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes <= 59) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
	}

	public void setSeconds(int seconds) {
		if (seconds >= 0 && seconds <= 59) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}

	public void upSeconds(int up) {
		houres = houres + up / 3600;
		if (houres >= 24) {
			houres = houres % 24;
		}
		up = up % 3600;
		minutes = minutes + up / 60;
		if (minutes >= 60) {
			minutes = minutes - 60;
			houres++;
		}
		up = up % 60;
		seconds = seconds + up;
		if (seconds >= 60) {
			seconds = seconds - 60;
			minutes++;
		}
	}

	public void upMinutes(int up) {
		houres = houres + up / 60;
		if (houres >= 24) {
			houres = houres % 24;
		}
		up = up % 60;
		minutes = minutes + up / 60;
		if (minutes >= 60) {
			minutes = minutes - 60;
			houres++;
		}

	}

	public void upHoures(int up) {
		houres = houres + up;
		if (houres >= 24) {
			houres = houres % 24;
		}
	}

	public void downSeconds(int down) {
		houres = houres - down / 3600;
		if (houres < 0) {
			houres = -(houres % 24);
		}
		down = down % 3600;
		minutes = minutes - down / 60;
		if (minutes < 0) {
			minutes = -(60 - minutes);
			houres--;
		}
		down = down % 60;
		seconds = seconds - down;
		if (seconds < 0) {
			seconds = -(60 - seconds);
			minutes--;
		}
	}

	public void downMinutes(int down) {
		houres = houres - down / 3600;
		if (houres < 0) {
			houres = -(houres % 24);
		}
		down = down % 3600;
		minutes = minutes - down / 60;
		if (minutes < 0) {
			minutes = -(60 - minutes);
			houres--;
		}

	}

	public void downHoures(int down) {
		houres = houres - down / 3600;
		if (houres < 0) {
			houres = -(houres % 24);
		}

	}

	public int getHoures() {
		return houres;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}
}
