package com.app.FundFlowBackend.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.FundFlowBackend.repository.FundingRoundRepository;
import com.app.FundFlowBackend.repository.StageRepository;
import com.app.FundFlowBackend.repository.DocumentRepository;
import com.app.FundFlowBackend.repository.InvestorRepository;
import com.app.FundFlowBackend.repository.FounderRepository;
import com.app.FundFlowBackend.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
