package com.defne.game.kalah.model;

import java.time.LocalDateTime;
public interface InterMatch {

		public String getId();
		public void setId(String id) ;
		public String getStatus() ;
		public void setStatus(String status);
		public String getMatchType() ;
		public void setMatchType(String matchType);
		public LocalDateTime getMatchStart() ;
		public void setMatchStart(LocalDateTime matchStart) ;
		public LocalDateTime getMatchEnd() ;
		public void setMatchEnd(LocalDateTime matchEnd);
}
