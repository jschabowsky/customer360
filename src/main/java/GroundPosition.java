

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroundPosition {

	public GroundPosition () {
	}

	public GroundPosition (
		PositionReport positionReport, 
		GenericFlightInfo genericFlightInfo, 
		SystemStatus systemStatus, 
		AdsbReport adsbReport, 
		MlatReport mlatReport, 
		Boolean m, 
		String airport) {
		this.positionReport = positionReport;
		this.genericFlightInfo = genericFlightInfo;
		this.systemStatus = systemStatus;
		this.adsbReport = adsbReport;
		this.mlatReport = mlatReport;
		this.m = m;
		this.airport = airport;
	}

	private PositionReport positionReport;
	private GenericFlightInfo genericFlightInfo;
	private SystemStatus systemStatus;
	private AdsbReport adsbReport;
	private MlatReport mlatReport;
	private Boolean m;
	private String airport;
	public PositionReport getPositionReport() {
		return positionReport;
	}

	public GroundPosition setPositionReport(PositionReport positionReport) {
		this.positionReport = positionReport;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class PositionReport {

		public PositionReport () {
		}


		public String toString() {
			return "PositionReport ["
			+ " ]";
		}
	}

	public GenericFlightInfo getGenericFlightInfo() {
		return genericFlightInfo;
	}

	public GroundPosition setGenericFlightInfo(GenericFlightInfo genericFlightInfo) {
		this.genericFlightInfo = genericFlightInfo;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class GenericFlightInfo {

		public GenericFlightInfo () {
		}

		public GenericFlightInfo (
			FlightInfo flightInfo, 
			FlightId flightId, 
			Interface _interface, 
			String type) {
			this.flightInfo = flightInfo;
			this.flightId = flightId;
			this._interface = _interface;
			this.type = type;
		}

		private FlightInfo flightInfo;
		private FlightId flightId;
		private Interface _interface;
		private String type;
		public FlightInfo getFlightInfo() {
			return flightInfo;
		}

		public GenericFlightInfo setFlightInfo(FlightInfo flightInfo) {
			this.flightInfo = flightInfo;
			return this;
		}



		@JsonInclude(JsonInclude.Include.NON_NULL)
		public static class FlightInfo {

			public FlightInfo () {
			}

			public FlightInfo (
				String scratchpad2, 
				String entryFix, 
				String scratchpad1, 
				String runway, 
				String category, 
				String acType, 
				String flightRules, 
				String exitFix, 
				String airport) {
				this.scratchpad2 = scratchpad2;
				this.entryFix = entryFix;
				this.scratchpad1 = scratchpad1;
				this.runway = runway;
				this.category = category;
				this.acType = acType;
				this.flightRules = flightRules;
				this.exitFix = exitFix;
				this.airport = airport;
			}

			private String scratchpad2;
			private String entryFix;
			private String scratchpad1;
			private String runway;
			private String category;
			private String acType;
			private String flightRules;
			private String exitFix;
			private String airport;
			public String getScratchpad2() {
				return scratchpad2;
			}

			public FlightInfo setScratchpad2(String scratchpad2) {
				this.scratchpad2 = scratchpad2;
				return this;
			}


			public String getEntryFix() {
				return entryFix;
			}

			public FlightInfo setEntryFix(String entryFix) {
				this.entryFix = entryFix;
				return this;
			}


			public String getScratchpad1() {
				return scratchpad1;
			}

			public FlightInfo setScratchpad1(String scratchpad1) {
				this.scratchpad1 = scratchpad1;
				return this;
			}


			public String getRunway() {
				return runway;
			}

			public FlightInfo setRunway(String runway) {
				this.runway = runway;
				return this;
			}


			public String getCategory() {
				return category;
			}

			public FlightInfo setCategory(String category) {
				this.category = category;
				return this;
			}


			public String getAcType() {
				return acType;
			}

			public FlightInfo setAcType(String acType) {
				this.acType = acType;
				return this;
			}


			public String getFlightRules() {
				return flightRules;
			}

			public FlightInfo setFlightRules(String flightRules) {
				this.flightRules = flightRules;
				return this;
			}


			public String getExitFix() {
				return exitFix;
			}

			public FlightInfo setExitFix(String exitFix) {
				this.exitFix = exitFix;
				return this;
			}


			public String getAirport() {
				return airport;
			}

			public FlightInfo setAirport(String airport) {
				this.airport = airport;
				return this;
			}

			public String toString() {
				return "FlightInfo ["
				+ " scratchpad2: " + scratchpad2
				+ " entryFix: " + entryFix
				+ " scratchpad1: " + scratchpad1
				+ " runway: " + runway
				+ " category: " + category
				+ " acType: " + acType
				+ " flightRules: " + flightRules
				+ " exitFix: " + exitFix
				+ " airport: " + airport
				+ " ]";
			}
		}

		public FlightId getFlightId() {
			return flightId;
		}

		public GenericFlightInfo setFlightId(FlightId flightId) {
			this.flightId = flightId;
			return this;
		}



		@JsonInclude(JsonInclude.Include.NON_NULL)
		public static class FlightId {

			public FlightId () {
			}

			public FlightId (
				String aircraftId, 
				String mode3ACode) {
				this.aircraftId = aircraftId;
				this.mode3ACode = mode3ACode;
			}

			private String aircraftId;
			private String mode3ACode;
			public String getAircraftId() {
				return aircraftId;
			}

			public FlightId setAircraftId(String aircraftId) {
				this.aircraftId = aircraftId;
				return this;
			}


			public String getMode3ACode() {
				return mode3ACode;
			}

			public FlightId setMode3ACode(String mode3ACode) {
				this.mode3ACode = mode3ACode;
				return this;
			}

			public String toString() {
				return "FlightId ["
				+ " aircraftId: " + aircraftId
				+ " mode3ACode: " + mode3ACode
				+ " ]";
			}
		}

		public Interface getInterface() {
			return _interface;
		}

		public GenericFlightInfo setInterface(Interface _interface) {
			this._interface = _interface;
			return this;
		}


		public static enum Interface { artsiiia,artsiiie,stars,gfp,microearts }
		public String getType() {
			return type;
		}

		public GenericFlightInfo setType(String type) {
			this.type = type;
			return this;
		}

		public String toString() {
			return "GenericFlightInfo ["
			+ " flightInfo: " + flightInfo
			+ " flightId: " + flightId
			+ " _interface: " + _interface
			+ " type: " + type
			+ " ]";
		}
	}

	public SystemStatus getSystemStatus() {
		return systemStatus;
	}

	public GroundPosition setSystemStatus(SystemStatus systemStatus) {
		this.systemStatus = systemStatus;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class SystemStatus {

		public SystemStatus () {
		}

		public SystemStatus (
			Mode mode, 
			State state) {
			this.mode = mode;
			this.state = state;
		}

		private Mode mode;
		private State state;
		public Mode getMode() {
			return mode;
		}

		public SystemStatus setMode(Mode mode) {
			this.mode = mode;
			return this;
		}


		public static enum Mode { operational,maintenance }
		public State getState() {
			return state;
		}

		public SystemStatus setState(State state) {
			this.state = state;
			return this;
		}


		public static enum State { online,degraded,offline,startup,shutdown }		public String toString() {
			return "SystemStatus ["
			+ " mode: " + mode
			+ " state: " + state
			+ " ]";
		}
	}

	public AdsbReport getAdsbReport() {
		return adsbReport;
	}

	public GroundPosition setAdsbReport(AdsbReport adsbReport) {
		this.adsbReport = adsbReport;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class AdsbReport {

		public AdsbReport () {
		}


		public String toString() {
			return "AdsbReport ["
			+ " ]";
		}
	}

	public MlatReport getMlatReport() {
		return mlatReport;
	}

	public GroundPosition setMlatReport(MlatReport mlatReport) {
		this.mlatReport = mlatReport;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class MlatReport {

		public MlatReport () {
		}


		public String toString() {
			return "MlatReport ["
			+ " ]";
		}
	}

	public Boolean getM() {
		return m;
	}

	public GroundPosition setM(Boolean m) {
		this.m = m;
		return this;
	}


	public String getAirport() {
		return airport;
	}

	public GroundPosition setAirport(String airport) {
		this.airport = airport;
		return this;
	}

	public String toString() {
		return "GroundPosition ["
		+ " positionReport: " + positionReport
		+ " genericFlightInfo: " + genericFlightInfo
		+ " systemStatus: " + systemStatus
		+ " adsbReport: " + adsbReport
		+ " mlatReport: " + mlatReport
		+ " m: " + m
		+ " airport: " + airport
		+ " ]";
	}
}
