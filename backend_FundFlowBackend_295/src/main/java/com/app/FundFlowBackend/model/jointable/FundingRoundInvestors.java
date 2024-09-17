package com.app.FundFlowBackend.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.FundFlowBackend.model.Stage;
import com.app.FundFlowBackend.model.Startup;
import com.app.FundFlowBackend.model.FundingRound;
import com.app.FundFlowBackend.model.Founder;
import com.app.FundFlowBackend.model.Document;
import com.app.FundFlowBackend.model.Investor;
import com.app.FundFlowBackend.enums.RoundStatus;
import com.app.FundFlowBackend.enums.StageName;
import com.app.FundFlowBackend.converter.StageNameConverter;
import com.app.FundFlowBackend.converter.RoundStatusConverter;

@Entity(name = "FundingRoundInvestors")
@Table(schema = "\"fundflowbackend61\"", name = "\"FundingRoundInvestors\"")
@Data
public class FundingRoundInvestors{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"RoundId\"")
	private Integer roundId;

    
    @Column(name = "\"InvestorId\"")
    private Integer investorId;
 
}