package domain;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class CommunityCard extends Card {

	public CommunityCard(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract void cardAction();

}
