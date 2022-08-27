/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newCpn;

import com.mxgraph.model.mxCell;
import java.util.ArrayList;
import view.JanelaScripts;
import view.Componente;
/**
 *
 * @author Lizandra
 */
public class GerarCPN {
    
            int idLugar = 1400000000, idLugar03S = 1410000000, idLugar05S = 1420000000, 
			idTransicao = 1300000000, 
			idType = 1500000000, idInitmark = 1600000000, 
			idType03S = 1510000000, idInitmark03S = 1610000000, 
			idType05S = 1520000000, idInitmark05S = 1620000000,
			idArco1 = 1450000000, idAnnot1 = 1550000000,
			idArco2 = 1460000000, idAnnot2 = 1560000000,
			idArco3 = 1470000000, idAnnot3 = 1570000000, 
			idArco4 = 1480000000, idAnnot4 = 1580000000,
			idArco5 = 1490000000, idAnnot5 = 1590000000,
			idTime= 1700000000, idPriority = 1710000000,
			idCode = 1720000000, idCond = 1730000000,
			idSubpageInfo= 1740000000,
			idInstancia1 = 1650000000, idInstancia2 = 1660000000,
			ultimoPlace = 1422680801; 
        
	
	String inicio = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\r\n" + 
			"<!DOCTYPE workspaceElements PUBLIC \"-//CPN//DTD CPNXML 1.0//EN\" \"http://cpntools.org/DTD/6/cpn.dtd\">\r\n" + 
			"\r\n" + 
			"<workspaceElements>\r\n" + 
			"  <generator tool=\"CPN Tools\"\r\n" + 
			"             version=\"4.0.1\"\r\n" + 
			"             format=\"6\"/>\r\n" + 
			" <cpnet>"
			+ "<globbox>\r\n" + 
			"      <block id=\"ID1412310166\">\r\n" + 
			"        <id>Standard priorities</id>\r\n" + 
			"        <ml id=\"ID1412310255\">val P_HIGH = 100;\r\n" + 
			"          <layout>val P_HIGH = 100;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1412310292\">val P_NORMAL = 1000;\r\n" + 
			"          <layout>val P_NORMAL = 1000;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1412310322\">val P_LOW = 10000;\r\n" + 
			"          <layout>val P_LOW = 10000;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"      </block>\r\n" + 
			"      <block id=\"ID1\">\r\n" + 
			"        <id>Standard declarations</id>\r\n" + 
			"        <color id=\"ID85042\">\r\n" + 
			"          <id>UNIT</id>\r\n" + 
			"          <unit/>\r\n" + 
			"          <layout>colset UNIT = unit;</layout>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID4\">\r\n" + 
			"          <id>BOOL</id>\r\n" + 
			"          <bool/>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID3\">\r\n" + 
			"          <id>INT</id>\r\n" + 
			"          <int/>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID1412312409\">\r\n" + 
			"          <id>INTINF</id>\r\n" + 
			"          <intinf/>\r\n" + 
			"          <layout>colset INTINF = intinf;</layout>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID1412312425\">\r\n" + 
			"          <id>TIME</id>\r\n" + 
			"          <time/>\r\n" + 
			"          <layout>colset TIME = time;</layout>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID1412322990\">\r\n" + 
			"          <id>REAL</id>\r\n" + 
			"          <real/>\r\n" + 
			"          <layout>colset REAL = real;</layout>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID5\">\r\n" + 
			"          <id>STRING</id>\r\n" + 
			"          <string/>\r\n" + 
			"        </color>\r\n" + 
			"      </block>\r\n" + 
			"      <block id=\"ID1422209946\">\r\n" + 
			"        <id>conjuntos de cores</id>\r\n" + 
			"        <color id=\"ID1422131685\">\r\n" + 
			"          <id>REQUIREMENT_TYPE</id>\r\n" + 
			"          <enum>\r\n" + 
			"            <id>acquisitionCost</id>\r\n" + 
			"            <id>powerInitial</id>\r\n" + 
			"            <id>power</id>\r\n" + 
			"            <id>exergy</id>\r\n" + 
			"            <id>operationalExergy</id>\r\n" + 
			"            <id>downtime</id>\r\n" + 
			"            <id>efficiencyTotal</id>\r\n" + 
			"            <id>operationalCost</id>\r\n" + 
			"            <id>totalCost</id>\r\n" + 
			"            <id>number9s</id>\r\n" + 
			"            <id>efficiency</id>\r\n" + 
			"            <id>ava</id>\r\n" + 
			"          </enum>\r\n" + 
			"          <layout>colset REQUIREMENT_TYPE = with\r\n" + 
			"acquisitionCost | powerInitial |power | exergy \r\n" + 
			"| operationalExergy | downtime | efficiencyTotal\r\n" + 
			"| operationalCost | totalCost \r\n" + 
			"| number9s | efficiency | ava ;</layout>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID1425205671\">\r\n" + 
			"          <id>ESTADO</id>\r\n" + 
			"          <bool>\r\n" + 
			"            <with>\r\n" + 
			"              <id>off</id>\r\n" + 
			"              <id>on</id>\r\n" + 
			"            </with>\r\n" + 
			"          </bool>\r\n" + 
			"          <layout>colset ESTADO = bool with (off, on);</layout>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID1422132583\">\r\n" + 
			"          <id>REQUIREMENT_VALUE</id>\r\n" + 
			"          <alias>\r\n" + 
			"            <id>REAL</id>\r\n" + 
			"          </alias>\r\n" + 
			"          <layout>colset REQUIREMENT_VALUE = REAL;</layout>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID1422133050\">\r\n" + 
			"          <id>REQUIREMENT</id>\r\n" + 
			"          <product>\r\n" + 
			"            <id>REQUIREMENT_TYPE</id>\r\n" + 
			"            <id>REQUIREMENT_VALUE</id>\r\n" + 
			"          </product>\r\n" + 
			"          <layout>colset REQUIREMENT = product\r\n" + 
			"    REQUIREMENT_TYPE * REQUIREMENT_VALUE;</layout>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID1422133529\">\r\n" + 
			"          <id>REQUIREMENT_LIST</id>\r\n" + 
			"          <list>\r\n" + 
			"            <id>REQUIREMENT</id>\r\n" + 
			"          </list>\r\n" + 
			"          <layout>colset REQUIREMENT_LIST = list REQUIREMENT;</layout>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID1422143313\">\r\n" + 
			"          <id>COMPONENT_TYPE</id>\r\n" + 
			"          <enum>\r\n" + 
			"            <id>UPSupply</id>\r\n" + 
			"            <id>SDTransformer</id>\r\n" + 
			"            <id>SubPanel</id>\r\n" + 
			"            <id>PowerStrip</id>\r\n" + 
			"          </enum>\r\n" + 
			"          <layout>colset COMPONENT_TYPE = with UPSupply | SDTransformer\r\n" + 
			"    | SubPanel | PowerStrip;</layout>\r\n" + 
			"        </color>\r\n" + 
			"        <color id=\"ID1426042305\">\r\n" + 
			"          <id>COMPONENT</id>\r\n" + 
			"          <timed/>\r\n" + 
			"          <record>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>componentType</id>\r\n" + 
			"              <id>COMPONENT_TYPE</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>name</id>\r\n" + 
			"              <id>STRING</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>acquisitionCost</id>\r\n" + 
			"              <id>REAL</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>potMax</id>\r\n" + 
			"              <id>REAL</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>efficiency</id>\r\n" + 
			"              <id>REAL</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>state</id>\r\n" + 
			"              <id>ESTADO</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>statenum</id>\r\n" + 
			"              <id>REAL</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>MTTF</id>\r\n" + 
			"              <id>REAL</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>MTTR</id>\r\n" + 
			"              <id>REAL</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>MTTF_INT</id>\r\n" + 
			"              <id>INT</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>MTTR_INT</id>\r\n" + 
			"              <id>INT</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"            <recordfield>\r\n" + 
			"              <id>availability</id>\r\n" + 
			"              <id>REAL</id>\r\n" + 
			"            </recordfield>\r\n" + 
			"          </record>\r\n" + 
			"          <layout>colset COMPONENT = record \r\n" + 
			"    componentType:COMPONENT_TYPE *\r\n" + 
			"    name:STRING *\r\n" + 
			"    acquisitionCost:REAL*\r\n" + 
			"    potMax:REAL*\r\n" + 
			"    efficiency:REAL*\r\n" + 
			"    state:ESTADO*\r\n" + 
			"    statenum:REAL*\r\n" + 
			"    MTTF:REAL*\r\n" + 
			"    MTTR:REAL*\r\n" + 
			"    MTTF_INT:INT*\r\n" + 
			"    MTTR_INT:INT*\r\n" + 
			"    availability:REAL timed;</layout>\r\n" + 
			"        </color>\r\n" + 
			"      </block>\r\n" + 
			"      <block id=\"ID1422211613\">\r\n" + 
			"        <id>variaveis e constantes</id>\r\n" + 
			"        <var id=\"ID1422144715\">\r\n" + 
			"          <type>\r\n" + 
			"            <id>COMPONENT</id>\r\n" + 
			"          </type>\r\n" + 
			"          <id>c</id>\r\n" + 
			"          <layout>var c:COMPONENT;</layout>\r\n" + 
			"        </var>\r\n" + 
			"        <var id=\"ID1422145433\">\r\n" + 
			"          <type>\r\n" + 
			"            <id>REQUIREMENT_LIST</id>\r\n" + 
			"          </type>\r\n" + 
			"          <id>reqs</id>\r\n" + 
			"          <layout>var reqs:REQUIREMENT_LIST;</layout>\r\n" + 
			"        </var>\r\n" + 
			"        <ml id=\"ID1422134020\">val ini = \r\n" + 
			"    1`[(acquisitionCost,0.0),(powerInitial,100.0),(power,100.0),\r\n" + 
			"(operationalExergy,0.0),(exergy,0.0),(operationalCost,0.0),\r\n" + 
			"(totalCost,0.0),(efficiencyTotal,0.0),\r\n" + 
			"(downtime,0.0),(number9s,0.0),(ava,1.0)];\r\n" + 
			"          <layout>val ini = \r\n" + 
			"    1`[(acquisitionCost,0.0),(powerInitial,100.0),(power,100.0),\r\n" + 
			"(operationalExergy,0.0),(exergy,0.0),(operationalCost,0.0),\r\n" + 
			"(totalCost,0.0),(efficiencyTotal,0.0),\r\n" + 
			"(downtime,0.0),(number9s,0.0),(ava,1.0)];</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1422146163\">val UPS = {\r\n" + 
			"    componentType=UPSupply,\r\n" + 
			"    name=&quot;UPS&quot;,\r\n" + 
			"    acquisitionCost=3600.0,\r\n" + 
			"    potMax=500.0,\r\n" + 
			"    efficiency=0.953,\r\n" + 
			"    state=on,\r\n" + 
			"    statenum=1.0,\r\n" + 
			"    MTTF=250000.00,\r\n" + 
			"    MTTR=8.0,\r\n" + 
			"    MTTF_INT=50000,\r\n" + 
			"    MTTR_INT=8,\r\n" + 
			"    availability=0.0\r\n" + 
			"};\r\n" + 
			"          <layout>val UPS = {\r\n" + 
			"    componentType=UPSupply,\r\n" + 
			"    name=&quot;UPS&quot;,\r\n" + 
			"    acquisitionCost=3600.0,\r\n" + 
			"    potMax=500.0,\r\n" + 
			"    efficiency=0.953,\r\n" + 
			"    state=on,\r\n" + 
			"    statenum=1.0,\r\n" + 
			"    MTTF=250000.00,\r\n" + 
			"    MTTR=8.0,\r\n" + 
			"    MTTF_INT=50000,\r\n" + 
			"    MTTR_INT=8,\r\n" + 
			"    availability=0.0\r\n" + 
			"};</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1422157471\">val SDT = {\r\n" + 
			"    componentType=SDTransformer,\r\n" + 
			"    name=&quot;SDT&quot;,\r\n" + 
			"    acquisitionCost=550.0,\r\n" + 
			"    potMax=200.0,\r\n" + 
			"    efficiency=0.985,\r\n" + 
			"    state=on,\r\n" + 
			"    statenum=1.0,\r\n" + 
			"    MTTF=1412908.33,\r\n" + 
			"    MTTR=156.01,\r\n" + 
			"    MTTF_INT=282500,\r\n" + 
			"    MTTR_INT=156,\r\n" + 
			"    availability=0.0\r\n" + 
			"};\r\n" + 
			"          <layout>val SDT = {\r\n" + 
			"    componentType=SDTransformer,\r\n" + 
			"    name=&quot;SDT&quot;,\r\n" + 
			"    acquisitionCost=550.0,\r\n" + 
			"    potMax=200.0,\r\n" + 
			"    efficiency=0.985,\r\n" + 
			"    state=on,\r\n" + 
			"    statenum=1.0,\r\n" + 
			"    MTTF=1412908.33,\r\n" + 
			"    MTTR=156.01,\r\n" + 
			"    MTTF_INT=282500,\r\n" + 
			"    MTTR_INT=156,\r\n" + 
			"    availability=0.0\r\n" + 
			"};</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1422159290\">val PS = {\r\n" + 
			"    componentType=PowerStrip,\r\n" + 
			"    name=&quot;PowerStrip&quot;,\r\n" + 
			"    acquisitionCost=200.0,\r\n" + 
			"    potMax=500.0,\r\n" + 
			"    efficiency=0.995,\r\n" + 
			"    state=on,\r\n" + 
			"    statenum=1.0,\r\n" + 
			"    MTTF=11511175.63,\r\n" + 
			"    MTTR=3.8,\r\n" + 
			"    MTTF_INT=2300000,\r\n" + 
			"    MTTR_INT=4,\r\n" + 
			"    availability=0.0\r\n" + 
			"};\r\n" + 
			"          <layout>val PS = {\r\n" + 
			"    componentType=PowerStrip,\r\n" + 
			"    name=&quot;PowerStrip&quot;,\r\n" + 
			"    acquisitionCost=200.0,\r\n" + 
			"    potMax=500.0,\r\n" + 
			"    efficiency=0.995,\r\n" + 
			"    state=on,\r\n" + 
			"    statenum=1.0,\r\n" + 
			"    MTTF=11511175.63,\r\n" + 
			"    MTTR=3.8,\r\n" + 
			"    MTTF_INT=2300000,\r\n" + 
			"    MTTR_INT=4,\r\n" + 
			"    availability=0.0\r\n" + 
			"};</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1422161173\">val SB = {\r\n" + 
			"    componentType=SubPanel,\r\n" + 
			"    name=&quot;SubPanel&quot;,\r\n" + 
			"    acquisitionCost=200.0,\r\n" + 
			"    potMax=500.0,\r\n" + 
			"    efficiency=0.995,\r\n" + 
			"    state=on,\r\n" + 
			"    statenum=1.0,\r\n" + 
			"    MTTF=1520000.0,\r\n" + 
			"    MTTR=2.4,\r\n" + 
			"    MTTF_INT=304000,\r\n" + 
			"    MTTR_INT=2,\r\n" + 
			"    availability=0.0\r\n" + 
			"};\r\n" + 
			"          <layout>val SB = {\r\n" + 
			"    componentType=SubPanel,\r\n" + 
			"    name=&quot;SubPanel&quot;,\r\n" + 
			"    acquisitionCost=200.0,\r\n" + 
			"    potMax=500.0,\r\n" + 
			"    efficiency=0.995,\r\n" + 
			"    state=on,\r\n" + 
			"    statenum=1.0,\r\n" + 
			"    MTTF=1520000.0,\r\n" + 
			"    MTTR=2.4,\r\n" + 
			"    MTTF_INT=304000,\r\n" + 
			"    MTTR_INT=2,\r\n" + 
			"    availability=0.0\r\n" + 
			"};</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1424805865\">val energia = [0.11,0.15,0.19,0.24]\r\n" + 
			"          <layout>val energia = [0.11,0.15,0.19,0.24]</layout>\r\n" + 
			"        </ml>\r\n" + 
			"      </block>\r\n" + 
			"      <block id=\"ID1423078630\">\r\n" + 
			"        <id>variaveis globais</id>\r\n" + 
			"        <globref id=\"ID1423079544\">\r\n" + 
			"          <id>costEnergy</id>\r\n" + 
			"          <ml>0.11: REAL</ml>\r\n" + 
			"          <layout>globref costEnergy=0.11: REAL;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1423080487\">\r\n" + 
			"          <id>period</id>\r\n" + 
			"          <ml>43800.0: REAL</ml>\r\n" + 
			"          <layout>globref period = 43800.0: REAL;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433811412\">\r\n" + 
			"          <id>startPos</id>\r\n" + 
			"          <ml>[]: int list</ml>\r\n" + 
			"          <layout>(*List with the starts position for branch instructions*)\r\n" + 
			"globref startPos=[]: int list;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433811542\">\r\n" + 
			"          <id>firstWrite</id>\r\n" + 
			"          <ml>true</ml>\r\n" + 
			"          <layout>(*Used in fun writeFile to write the menu*)\r\n" + 
			"globref firstWrite=true;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433811684\">\r\n" + 
			"          <id>energyNewReplication</id>\r\n" + 
			"          <ml>0</ml>\r\n" + 
			"          <layout>(*Used in CheckEnd() for the new number of Replications*)\r\n" + 
			"globref energyNewReplication=0;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433811838\">\r\n" + 
			"          <id>timeNewReplication</id>\r\n" + 
			"          <ml>0</ml>\r\n" + 
			"          <layout>(*Used in CheckEnd() for the new number of Replications*)\r\n" + 
			"globref timeNewReplication=0;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433812006\">\r\n" + 
			"          <id>nReplication</id>\r\n" + 
			"          <ml>10</ml>\r\n" + 
			"          <layout>(*Number of Initial Relications*)\r\n" + 
			"globref nReplication=10;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433812185\">\r\n" + 
			"          <id>isEnd</id>\r\n" + 
			"          <ml>0</ml>\r\n" + 
			"          <layout>globref isEnd=0;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433812375\">\r\n" + 
			"          <id>nReplicationExec</id>\r\n" + 
			"          <ml>1</ml>\r\n" + 
			"          <layout>(* Replication Number Executed *)\r\n" + 
			"globref nReplicationExec=1;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433812577\">\r\n" + 
			"          <id>meanTimeList</id>\r\n" + 
			"          <ml>[] : real list</ml>\r\n" + 
			"          <layout>(*List with the mean times of the replications*)\r\n" + 
			"globref meanTimeList= [] : real list;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433812791\">\r\n" + 
			"          <id>meanEnergyList</id>\r\n" + 
			"          <ml>[] : real list</ml>\r\n" + 
			"          <layout>(*List with the mean energy of the replications*)\r\n" + 
			"globref meanEnergyList= [] : real list;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433813759\">\r\n" + 
			"          <id>nIterExec</id>\r\n" + 
			"          <ml>0</ml>\r\n" + 
			"          <layout>globref nIterExec=0;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433813630\">\r\n" + 
			"          <id>timeU</id>\r\n" + 
			"          <ml>0.0</ml>\r\n" + 
			"          <layout>globref timeU=0.0;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433814174\">\r\n" + 
			"          <id>log</id>\r\n" + 
			"          <ml>TextIO.openOut(&quot;teste.log&quot;)</ml>\r\n" + 
			"          <layout>(* Arquivo de log da rede *)\r\n" + 
			"globref log = TextIO.openOut(&quot;teste.log&quot;);</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433814466\">\r\n" + 
			"          <id>energy</id>\r\n" + 
			"          <ml>0.0 : real</ml>\r\n" + 
			"          <layout>(* Energy consumption of current iteraction *)\r\n" + 
			"globref energy=0.0 : real;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433814770\">\r\n" + 
			"          <id>energyList</id>\r\n" + 
			"          <ml>[] : real list</ml>\r\n" + 
			"          <layout>(* Consumos das\r\n" + 
			"iteracoes *)\r\n" + 
			"globref energyList = [] : real list;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"        <globref id=\"ID1433815086\">\r\n" + 
			"          <id>timeList</id>\r\n" + 
			"          <ml>[] : real list</ml>\r\n" + 
			"          <layout>(* Tempo das iteracoes *)\r\n" + 
			"globref timeList = [] : real list;</layout>\r\n" + 
			"        </globref>\r\n" + 
			"      </block>\r\n" + 
			"      <block id=\"ID1422200431\">\r\n" + 
			"        <id>funcoes</id>\r\n" + 
			"        <ml id=\"ID1433970462\">fun writeFile2(log)= \r\n" + 
			"(  \r\n" + 
			" let \r\n" + 
			"     val File=TextIO.openAppend(&quot;veriPower.log&quot;) \r\n" + 
			"   in\r\n" + 
			"     TextIO.output(File,log);\r\n" + 
			"     TextIO.closeOut(File)\r\n" + 
			" end\r\n" + 
			");\r\n" + 
			"          <layout>(* Write the text passed by parameter in the file*)\r\n" + 
			"fun writeFile2(log)= \r\n" + 
			"(  \r\n" + 
			" let \r\n" + 
			"     val File=TextIO.openAppend(&quot;veriPower.log&quot;) \r\n" + 
			"   in\r\n" + 
			"     TextIO.output(File,log);\r\n" + 
			"     TextIO.closeOut(File)\r\n" + 
			" end\r\n" + 
			");</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1433968592\">fun veriPower(energydemand: REAL, MaxPower: REAL, disp: STRING)=\r\n" + 
			"let \r\n" + 
			"  val energydemand1= energydemand;\r\n" + 
			"  val MaxPower1 = MaxPower; \r\n" + 
			"  val disp1 = disp; \r\n" + 
			"in\r\n" + 
			"  if (energydemand1 &gt; MaxPower1) then \r\n" + 
			"      writeFile2(&quot;\\n\\nFalha no Fluxo de Energia &quot; ^ &quot;\\n&quot; ^\r\n" + 
			"              &quot;Componente com problema de fluxo de energia detectado &quot; ^ disp1 ^ &quot;\\n&quot; ^\r\n" + 
			"              &quot;Capacidade Mxima de energia: &quot; ^ Real.toString MaxPower1  ^ &quot;\\n&quot; ^\r\n" + 
			"              &quot;Fluxo de energia: &quot; ^ Real.toString energydemand1  ^ &quot;\\n&quot; ^\r\n" + 
			"              &quot;\\n&quot;)\r\n" + 
			"  else()\r\n" + 
			"end\r\n" + 
			"          <layout>fun veriPower(energydemand: REAL, MaxPower: REAL, disp: STRING)=\r\n" + 
			"let \r\n" + 
			"  val energydemand1= energydemand;\r\n" + 
			"  val MaxPower1 = MaxPower; \r\n" + 
			"  val disp1 = disp; \r\n" + 
			"in\r\n" + 
			"  if (energydemand1 &gt; MaxPower1) then \r\n" + 
			"      writeFile2(&quot;\\n\\nFalha no Fluxo de Energia &quot; ^ &quot;\\n&quot; ^\r\n" + 
			"              &quot;Componente com problema de fluxo de energia detectado &quot; ^ disp1 ^ &quot;\\n&quot; ^\r\n" + 
			"              &quot;Capacidade Mxima de energia: &quot; ^ Real.toString MaxPower1  ^ &quot;\\n&quot; ^\r\n" + 
			"              &quot;Fluxo de energia: &quot; ^ Real.toString energydemand1  ^ &quot;\\n&quot; ^\r\n" + 
			"              &quot;\\n&quot;)\r\n" + 
			"  else()\r\n" + 
			"end</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1422200877\">fun calcPw(r:REQUIREMENT, c:COMPONENT,lista:REQUIREMENT_LIST) =\r\n" + 
			"    let\r\n" + 
			"        val rtype = (#1 r)\r\n" + 
			"        val rval = (#2 r)\r\n" + 
			"        val powerReq = List.nth(lista,2)\r\n" + 
			"        val powerIn = (#2 powerReq)\r\n" + 
			"        val name = (#componentType c)\r\n" + 
			"    in \r\n" + 
			"        case rtype of \r\n" + 
			"          acquisitionCost =&gt; (rtype, rval+0.0)\r\n" + 
			"        |power =&gt; (rtype, (rval/(#efficiency c))*(#statenum c))\r\n" + 
			"        |powerInitial=&gt;(rtype,rval+0.0)\r\n" + 
			"        |operationalExergy=&gt;(rtype,rval+0.0)\r\n" + 
			"        |exergy =&gt;(rtype, rval+0.0)\r\n" + 
			"        |downtime =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |totalCost=&gt;(rtype,rval+0.0)\r\n" + 
			"        |number9s =&gt; (rtype, rval+0.0)\r\n" + 
			"        |operationalCost=&gt;(rtype, rval+0.0)\r\n" + 
			"        |efficiencyTotal=&gt;(rtype,rval+0.0)\r\n" + 
			"        |ava =&gt;  (rtype ,((rval)*(#availability c)))\r\n" + 
			"      \r\n" + 
			"\r\n" + 
			"    end;\r\n" + 
			"          <layout>fun calcPw(r:REQUIREMENT, c:COMPONENT,lista:REQUIREMENT_LIST) =\r\n" + 
			"    let\r\n" + 
			"        val rtype = (#1 r)\r\n" + 
			"        val rval = (#2 r)\r\n" + 
			"        val powerReq = List.nth(lista,2)\r\n" + 
			"        val powerIn = (#2 powerReq)\r\n" + 
			"        val name = (#componentType c)\r\n" + 
			"    in \r\n" + 
			"        case rtype of \r\n" + 
			"          acquisitionCost =&gt; (rtype, rval+0.0)\r\n" + 
			"        |power =&gt; (rtype, (rval/(#efficiency c))*(#statenum c))\r\n" + 
			"        |powerInitial=&gt;(rtype,rval+0.0)\r\n" + 
			"        |operationalExergy=&gt;(rtype,rval+0.0)\r\n" + 
			"        |exergy =&gt;(rtype, rval+0.0)\r\n" + 
			"        |downtime =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |totalCost=&gt;(rtype,rval+0.0)\r\n" + 
			"        |number9s =&gt; (rtype, rval+0.0)\r\n" + 
			"        |operationalCost=&gt;(rtype, rval+0.0)\r\n" + 
			"        |efficiencyTotal=&gt;(rtype,rval+0.0)\r\n" + 
			"        |ava =&gt;  (rtype ,((rval)*(#availability c)))\r\n" + 
			"      \r\n" + 
			"\r\n" + 
			"    end;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1422200681\">fun calcPwproc(rs,c) = \r\n" + 
			"    let\r\n" + 
			"        fun Sval(r) = calcPw(r, c, rs)\r\n" + 
			"        val res = (map Sval rs)\r\n" + 
			"        val powerReq = List.nth(res,2)\r\n" + 
			"        val powerIn = (#2 powerReq)\r\n" + 
			"        val maxPower = (#potMax c)\r\n" + 
			"    in\r\n" + 
			"       res\r\n" + 
			"   end;\r\n" + 
			"          <layout>fun calcPwproc(rs,c) = \r\n" + 
			"    let\r\n" + 
			"        fun Sval(r) = calcPw(r, c, rs)\r\n" + 
			"        val res = (map Sval rs)\r\n" + 
			"        val powerReq = List.nth(res,2)\r\n" + 
			"        val powerIn = (#2 powerReq)\r\n" + 
			"        val maxPower = (#potMax c)\r\n" + 
			"    in\r\n" + 
			"       res\r\n" + 
			"   end;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1422703403\">fun calcAcExer(r:REQUIREMENT, c:COMPONENT,lista:REQUIREMENT_LIST) =\r\n" + 
			"    let\r\n" + 
			"        val rtype = (#1 r)\r\n" + 
			"        val rval = (#2 r)\r\n" + 
			"        val powerReq = List.nth(lista,2)\r\n" + 
			"        val powerIn = (#2 powerReq)\r\n" + 
			"    in \r\n" + 
			"        case rtype of \r\n" + 
			"          acquisitionCost =&gt; (rtype, rval+(#acquisitionCost c))\r\n" + 
			"        |power =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |powerInitial=&gt;(rtype,rval+0.0)\r\n" + 
			"        |operationalExergy=&gt;(rtype,rval+0.0)\r\n" + 
			"        |exergy =&gt;(rtype, rval + (powerIn*(1.0 - #efficiency c)))\r\n" + 
			"        |downtime =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |totalCost=&gt;(rtype,rval+0.0)\r\n" + 
			"        |number9s=&gt; (rtype,rval+0.0)\r\n" + 
			"        |operationalCost=&gt;(rtype, rval+0.0)\r\n" + 
			"        |efficiencyTotal=&gt;(rtype,rval+0.0)\r\n" + 
			"        |ava =&gt;  (rtype ,rval)\r\n" + 
			"    end;\r\n" + 
			"          <layout>fun calcAcExer(r:REQUIREMENT, c:COMPONENT,lista:REQUIREMENT_LIST) =\r\n" + 
			"    let\r\n" + 
			"        val rtype = (#1 r)\r\n" + 
			"        val rval = (#2 r)\r\n" + 
			"        val powerReq = List.nth(lista,2)\r\n" + 
			"        val powerIn = (#2 powerReq)\r\n" + 
			"    in \r\n" + 
			"        case rtype of \r\n" + 
			"          acquisitionCost =&gt; (rtype, rval+(#acquisitionCost c))\r\n" + 
			"        |power =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |powerInitial=&gt;(rtype,rval+0.0)\r\n" + 
			"        |operationalExergy=&gt;(rtype,rval+0.0)\r\n" + 
			"        |exergy =&gt;(rtype, rval + (powerIn*(1.0 - #efficiency c)))\r\n" + 
			"        |downtime =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |totalCost=&gt;(rtype,rval+0.0)\r\n" + 
			"        |number9s=&gt; (rtype,rval+0.0)\r\n" + 
			"        |operationalCost=&gt;(rtype, rval+0.0)\r\n" + 
			"        |efficiencyTotal=&gt;(rtype,rval+0.0)\r\n" + 
			"        |ava =&gt;  (rtype ,rval)\r\n" + 
			"    end;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1422701566\">fun calcAcExerproc(rs,c) = \r\n" + 
			"    let\r\n" + 
			"        fun Sval(r) = calcAcExer(r, c, rs)\r\n" + 
			"        val res = (map Sval rs)\r\n" + 
			"    in\r\n" + 
			"        res\r\n" + 
			"    end;\r\n" + 
			"          <layout>fun calcAcExerproc(rs,c) = \r\n" + 
			"    let\r\n" + 
			"        fun Sval(r) = calcAcExer(r, c, rs)\r\n" + 
			"        val res = (map Sval rs)\r\n" + 
			"    in\r\n" + 
			"        res\r\n" + 
			"    end;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1423190559\">fun calcTot(r:REQUIREMENT, lista:REQUIREMENT_LIST) =\r\n" + 
			"    let\r\n" + 
			"        val rtype = (#1 r)\r\n" + 
			"        val rval = (#2 r)\r\n" + 
			"        val costAqu = List.nth(lista,0)\r\n" + 
			"        val costResu = (#2 costAqu )\r\n" + 
			"        val exergyReq = List.nth(lista,4)\r\n" + 
			"        val exergyResu = (#2 exergyReq)\r\n" + 
			"        val powerReqInI = List.nth(lista,1)\r\n" + 
			"        val powerInIt = (#2 powerReqInI)\r\n" + 
			"        val powerReq = List.nth(lista,2)\r\n" + 
			"        val powerIn = (#2 powerReq)\r\n" + 
			"        val ava1 = List.nth(lista,10)\r\n" + 
			"        val avaEnd = (#2 ava1)\r\n" + 
			"        \r\n" + 
			"    in \r\n" + 
			"        case rtype of \r\n" + 
			"          acquisitionCost =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |power =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |powerInitial=&gt;(rtype,rval+0.0)\r\n" + 
			"        |operationalExergy=&gt;(rtype,(exergyResu)*(avaEnd )*(!period)*(3.6/1000.0))\r\n" + 
			"        |exergy =&gt;(rtype, rval + 0.0)\r\n" + 
			"        |operationalCost=&gt;(rtype, !costEnergy*(!period)*(powerIn))\r\n" + 
			"        |totalCost=&gt;(rtype,rval+0.0)\r\n" + 
			"        |efficiencyTotal=&gt;(rtype,powerInIt/powerIn)\r\n" + 
			"        |downtime =&gt; (rtype, (1.0 - avaEnd) *(!period))\r\n" + 
			"        |number9s=&gt;(rtype, ((Math.log10 (1.0 - avaEnd)))*(~1.0))\r\n" + 
			"        |ava =&gt;  (rtype ,rval)\r\n" + 
			"       \r\n" + 
			"        \r\n" + 
			"    end;\r\n" + 
			"          <layout>fun calcTot(r:REQUIREMENT, lista:REQUIREMENT_LIST) =\r\n" + 
			"    let\r\n" + 
			"        val rtype = (#1 r)\r\n" + 
			"        val rval = (#2 r)\r\n" + 
			"        val costAqu = List.nth(lista,0)\r\n" + 
			"        val costResu = (#2 costAqu )\r\n" + 
			"        val exergyReq = List.nth(lista,4)\r\n" + 
			"        val exergyResu = (#2 exergyReq)\r\n" + 
			"        val powerReqInI = List.nth(lista,1)\r\n" + 
			"        val powerInIt = (#2 powerReqInI)\r\n" + 
			"        val powerReq = List.nth(lista,2)\r\n" + 
			"        val powerIn = (#2 powerReq)\r\n" + 
			"        val ava1 = List.nth(lista,10)\r\n" + 
			"        val avaEnd = (#2 ava1)\r\n" + 
			"        \r\n" + 
			"    in \r\n" + 
			"        case rtype of \r\n" + 
			"          acquisitionCost =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |power =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |powerInitial=&gt;(rtype,rval+0.0)\r\n" + 
			"        |operationalExergy=&gt;(rtype,(exergyResu)*(avaEnd )*(!period)*(3.6/1000.0))\r\n" + 
			"        |exergy =&gt;(rtype, rval + 0.0)\r\n" + 
			"        |operationalCost=&gt;(rtype, !costEnergy*(!period)*(powerIn))\r\n" + 
			"        |totalCost=&gt;(rtype,rval+0.0)\r\n" + 
			"        |efficiencyTotal=&gt;(rtype,powerInIt/powerIn)\r\n" + 
			"        |downtime =&gt; (rtype, (1.0 - avaEnd) *(!period))\r\n" + 
			"        |number9s=&gt;(rtype, ((Math.log10 (1.0 - avaEnd)))*(~1.0))\r\n" + 
			"        |ava =&gt;  (rtype ,rval)\r\n" + 
			"       \r\n" + 
			"        \r\n" + 
			"    end;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1423129960\">fun calcTotproc(rs) = \r\n" + 
			"    let\r\n" + 
			"        fun Sval(r) = calcTot(r, rs)\r\n" + 
			"        val res = (map Sval rs)\r\n" + 
			"    in\r\n" + 
			"        res\r\n" + 
			"    end;\r\n" + 
			"          <layout>fun calcTotproc(rs) = \r\n" + 
			"    let\r\n" + 
			"        fun Sval(r) = calcTot(r, rs)\r\n" + 
			"        val res = (map Sval rs)\r\n" + 
			"    in\r\n" + 
			"        res\r\n" + 
			"    end;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1423334657\">fun calcOpe(r:REQUIREMENT, lista:REQUIREMENT_LIST) =\r\n" + 
			"    let\r\n" + 
			"        val rtype = (#1 r)\r\n" + 
			"        val rval = (#2 r)\r\n" + 
			"        val costAqu = List.nth(lista,0)\r\n" + 
			"        val costResu = (#2 costAqu )\r\n" + 
			"        val costTot= List.nth(lista,5)\r\n" + 
			"        val costTotResu = (#2 costTot)\r\n" + 
			"    in \r\n" + 
			"        case rtype of \r\n" + 
			"          acquisitionCost =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |power =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |powerInitial=&gt;(rtype,rval+0.0)\r\n" + 
			"        |operationalExergy=&gt;(rtype,rval + 0.0)\r\n" + 
			"        |exergy =&gt;(rtype, rval + 0.0)\r\n" + 
			"        |operationalCost=&gt;(rtype, rval + 0.0)\r\n" + 
			"        |totalCost=&gt;(rtype,costResu+costTotResu)\r\n" + 
			"        |efficiencyTotal=&gt;(rtype,rval + 0.0)\r\n" + 
			"        |downtime =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |number9s=&gt;(rtype, rval + 0.0)\r\n" + 
			"        |ava =&gt;  (rtype ,rval)\r\n" + 
			"    end;\r\n" + 
			"          <layout>fun calcOpe(r:REQUIREMENT, lista:REQUIREMENT_LIST) =\r\n" + 
			"    let\r\n" + 
			"        val rtype = (#1 r)\r\n" + 
			"        val rval = (#2 r)\r\n" + 
			"        val costAqu = List.nth(lista,0)\r\n" + 
			"        val costResu = (#2 costAqu )\r\n" + 
			"        val costTot= List.nth(lista,5)\r\n" + 
			"        val costTotResu = (#2 costTot)\r\n" + 
			"    in \r\n" + 
			"        case rtype of \r\n" + 
			"          acquisitionCost =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |power =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |powerInitial=&gt;(rtype,rval+0.0)\r\n" + 
			"        |operationalExergy=&gt;(rtype,rval + 0.0)\r\n" + 
			"        |exergy =&gt;(rtype, rval + 0.0)\r\n" + 
			"        |operationalCost=&gt;(rtype, rval + 0.0)\r\n" + 
			"        |totalCost=&gt;(rtype,costResu+costTotResu)\r\n" + 
			"        |efficiencyTotal=&gt;(rtype,rval + 0.0)\r\n" + 
			"        |downtime =&gt; (rtype, rval + 0.0)\r\n" + 
			"        |number9s=&gt;(rtype, rval + 0.0)\r\n" + 
			"        |ava =&gt;  (rtype ,rval)\r\n" + 
			"    end;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1423334149\">fun calcOpeproc(rs) = \r\n" + 
			"    let\r\n" + 
			"        fun Sval(r) = calcOpe(r, rs)\r\n" + 
			"        val res = (map Sval rs)\r\n" + 
			"    in\r\n" + 
			"        res\r\n" + 
			"    end;\r\n" + 
			"          <layout>fun calcOpeproc(rs) = \r\n" + 
			"    let\r\n" + 
			"        fun Sval(r) = calcOpe(r, rs)\r\n" + 
			"        val res = (map Sval rs)\r\n" + 
			"    in\r\n" + 
			"        res\r\n" + 
			"    end;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1425228049\">fun reevalStateOn (c:COMPONENT) =\r\n" + 
			"    let\r\n" + 
			"        val ctype=\r\n" + 
			"            (#componentType c)\r\n" + 
			"    in\r\n" + 
			"        if ctype=PowerStrip\r\n" + 
			"        then 1`{componentType=PowerStrip,name=&quot;PowerStrip&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=not off,statenum=1.0,MTTF=(#MTTF c),MTTR=(#MTTR c), MTTF_INT=(#MTTF_INT c),\r\n" + 
			"                 MTTR_INT=(#MTTR_INT c), availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else if ctype=SubPanel \r\n" + 
			"        then 1`{componentType=SubPanel,name=&quot;SubPanel&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=not off,statenum=1.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c) ,availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"         else if ctype=SDTransformer\r\n" + 
			"        then 1`{componentType=SDTransformer,name=&quot;SDT&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=not off,statenum=1.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                  MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c), availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else if ctype=UPSupply\r\n" + 
			"        then 1`{componentType=UPSupply,name=&quot;UPS&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=not off,statenum=1.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                  MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c), availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else 1`c\r\n" + 
			"    end;\r\n" + 
			"          <layout>fun reevalStateOn (c:COMPONENT) =\r\n" + 
			"    let\r\n" + 
			"        val ctype=\r\n" + 
			"            (#componentType c)\r\n" + 
			"    in\r\n" + 
			"        if ctype=PowerStrip\r\n" + 
			"        then 1`{componentType=PowerStrip,name=&quot;PowerStrip&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=not off,statenum=1.0,MTTF=(#MTTF c),MTTR=(#MTTR c), MTTF_INT=(#MTTF_INT c),\r\n" + 
			"                 MTTR_INT=(#MTTR_INT c), availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else if ctype=SubPanel \r\n" + 
			"        then 1`{componentType=SubPanel,name=&quot;SubPanel&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=not off,statenum=1.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c) ,availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"         else if ctype=SDTransformer\r\n" + 
			"        then 1`{componentType=SDTransformer,name=&quot;SDT&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=not off,statenum=1.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                  MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c), availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else if ctype=UPSupply\r\n" + 
			"        then 1`{componentType=UPSupply,name=&quot;UPS&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=not off,statenum=1.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                  MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c), availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else 1`c\r\n" + 
			"    end;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1425376625\">fun reevalStateOff (c:COMPONENT) =\r\n" + 
			"    let\r\n" + 
			"        val ctype=\r\n" + 
			"            (#componentType c)\r\n" + 
			"    in\r\n" + 
			"        if ctype=PowerStrip\r\n" + 
			"        then 1`{componentType=PowerStrip,name=&quot;PowerStrip&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=off,statenum=0.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                 MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c), availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else if ctype=SubPanel \r\n" + 
			"        then 1`{componentType=SubPanel,name=&quot;SubPanel&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=off,statenum=0.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                 MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c) , availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"         else if ctype=SDTransformer\r\n" + 
			"        then 1`{componentType=SDTransformer,name=&quot;SDT&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=off,statenum=0.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c) , availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else if ctype=UPSupply\r\n" + 
			"        then 1`{componentType=UPSupply,name=&quot;UPS&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=off,statenum=0.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c), availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else 1`c\r\n" + 
			"    end;\r\n" + 
			"          <layout>fun reevalStateOff (c:COMPONENT) =\r\n" + 
			"    let\r\n" + 
			"        val ctype=\r\n" + 
			"            (#componentType c)\r\n" + 
			"    in\r\n" + 
			"        if ctype=PowerStrip\r\n" + 
			"        then 1`{componentType=PowerStrip,name=&quot;PowerStrip&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=off,statenum=0.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                 MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c), availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else if ctype=SubPanel \r\n" + 
			"        then 1`{componentType=SubPanel,name=&quot;SubPanel&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=off,statenum=0.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                 MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c) , availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"         else if ctype=SDTransformer\r\n" + 
			"        then 1`{componentType=SDTransformer,name=&quot;SDT&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=off,statenum=0.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c) , availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else if ctype=UPSupply\r\n" + 
			"        then 1`{componentType=UPSupply,name=&quot;UPS&quot;,acquisitionCost=(#acquisitionCost c),potMax=(#potMax c),efficiency=(#efficiency c),state=off,statenum=0.0,MTTF=(#MTTF c),MTTR=(#MTTR c), \r\n" + 
			"                MTTF_INT=(#MTTF_INT c), MTTR_INT=(#MTTR_INT c), availability=(#MTTF c)/((#MTTR c)+ (#MTTF c))}\r\n" + 
			"        else 1`c\r\n" + 
			"    end;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1432116510\">fun writeFile(log)= \r\n" + 
			"(  \r\n" + 
			" let \r\n" + 
			"     val File=TextIO.openAppend(&quot;ArchiA.log&quot;) \r\n" + 
			"   in\r\n" + 
			"     TextIO.output(File,log);\r\n" + 
			"     TextIO.closeOut(File)\r\n" + 
			" end\r\n" + 
			");\r\n" + 
			"          <layout>(* Write the text passed by parameter in the file*)\r\n" + 
			"fun writeFile(log)= \r\n" + 
			"(  \r\n" + 
			" let \r\n" + 
			"     val File=TextIO.openAppend(&quot;ArchiA.log&quot;) \r\n" + 
			"   in\r\n" + 
			"     TextIO.output(File,log);\r\n" + 
			"     TextIO.closeOut(File)\r\n" + 
			" end\r\n" + 
			");</layout>\r\n" + 
			"        </ml>\r\n" + 
			"      </block>\r\n" + 
			"      <block id=\"ID1433815243\">\r\n" + 
			"        <id>cons</id>\r\n" + 
			"        <ml id=\"ID1433815745\">val nMaxReplication=100;\r\n" + 
			"          <layout>(*Max Number of Replication*)\r\n" + 
			"val nMaxReplication=100;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1433816098\">val absPreTime=120.0;\r\n" + 
			"          <layout>(*Absolute Precision for Time*)\r\n" + 
			"val absPreTime=120.0;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1433816462\">val absPreEner=10.0;\r\n" + 
			"          <layout>(*Absolute Precision for Energy*)\r\n" + 
			"val absPreEner=10.0;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1433816840\">val nIter = 10;\r\n" + 
			"          <layout>(* Iterations number of all replications*)\r\n" + 
			"val nIter = 10;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <ml id=\"ID1433817228\">val value={jump=0};\r\n" + 
			"          <layout>(*Value in Token*)\r\n" + 
			"val value={jump=0};</layout>\r\n" + 
			"        </ml>\r\n" + 
			"        <block id=\"ID1433817424\">\r\n" + 
			"          <id>T-Student</id>\r\n" + 
			"          <ml id=\"ID1433818033\">val t_table1=\r\n" + 
			"[\r\n" + 
			"3.078 ,\r\n" + 
			" 1.886 ,\r\n" + 
			" 1.638 ,\r\n" + 
			" 1.533 ,\r\n" + 
			" 1.476 ,\r\n" + 
			" 1.440 ,\r\n" + 
			" 1.415 ,\r\n" + 
			" 1.397 ,\r\n" + 
			" 1.383 ,\r\n" + 
			" 1.372 ,\r\n" + 
			" 1.363 ,\r\n" + 
			" 1.356 ,\r\n" + 
			" 1.350 ,\r\n" + 
			" 1.345 ,\r\n" + 
			" 1.341 ,\r\n" + 
			" 1.337 ,\r\n" + 
			" 1.333 ,\r\n" + 
			" 1.330 ,\r\n" + 
			" 1.328 ,\r\n" + 
			" 1.325 ,\r\n" + 
			" 1.323 ,\r\n" + 
			" 1.321 ,\r\n" + 
			" 1.319 ,\r\n" + 
			" 1.318 ,\r\n" + 
			" 1.316 ,\r\n" + 
			" 1.315 ,\r\n" + 
			" 1.314 ,\r\n" + 
			" 1.313 ,\r\n" + 
			" 1.311 ,\r\n" + 
			" 1.310 ,\r\n" + 
			" 1.309 ,\r\n" + 
			" 1.309 ,\r\n" + 
			" 1.308 ,\r\n" + 
			" 1.307 ,\r\n" + 
			" 1.306 ,\r\n" + 
			" 1.306 ,\r\n" + 
			" 1.305 ,\r\n" + 
			" 1.304 ,\r\n" + 
			" 1.304 ,\r\n" + 
			" 1.303 ,\r\n" + 
			" 1.303 ,\r\n" + 
			" 1.302 ,\r\n" + 
			" 1.302 ,\r\n" + 
			" 1.301 ,\r\n" + 
			" 1.301 ,\r\n" + 
			" 1.300 ,\r\n" + 
			" 1.300 ,\r\n" + 
			" 1.299 ,\r\n" + 
			" 1.299 ,\r\n" + 
			" 1.299 ,\r\n" + 
			" 1.298 ,\r\n" + 
			" 1.298 ,\r\n" + 
			" 1.298 ,\r\n" + 
			" 1.297 ,\r\n" + 
			" 1.297 ,\r\n" + 
			" 1.297 ,\r\n" + 
			" 1.297 ,\r\n" + 
			" 1.296 ,\r\n" + 
			" 1.296 ,\r\n" + 
			" 1.296 ,\r\n" + 
			" 1.296 ,\r\n" + 
			" 1.295 ,\r\n" + 
			" 1.295 ,\r\n" + 
			" 1.295 ,\r\n" + 
			" 1.295 ,\r\n" + 
			" 1.295 ,\r\n" + 
			" 1.294 ,\r\n" + 
			" 1.294 ,\r\n" + 
			" 1.294 ,\r\n" + 
			" 1.294 ,\r\n" + 
			" 1.294 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.290 ,\r\n" + 
			" 1.290 ,\r\n" + 
			" 1.290 ,\r\n" + 
			" 1.290 ,\r\n" + 
			" 1.290 ,\r\n" + 
			" 1.282 \r\n" + 
			"]\r\n" + 
			"            <layout>(* alfa/2=0.10*)\r\n" + 
			"val t_table1=\r\n" + 
			"[\r\n" + 
			"3.078 ,\r\n" + 
			" 1.886 ,\r\n" + 
			" 1.638 ,\r\n" + 
			" 1.533 ,\r\n" + 
			" 1.476 ,\r\n" + 
			" 1.440 ,\r\n" + 
			" 1.415 ,\r\n" + 
			" 1.397 ,\r\n" + 
			" 1.383 ,\r\n" + 
			" 1.372 ,\r\n" + 
			" 1.363 ,\r\n" + 
			" 1.356 ,\r\n" + 
			" 1.350 ,\r\n" + 
			" 1.345 ,\r\n" + 
			" 1.341 ,\r\n" + 
			" 1.337 ,\r\n" + 
			" 1.333 ,\r\n" + 
			" 1.330 ,\r\n" + 
			" 1.328 ,\r\n" + 
			" 1.325 ,\r\n" + 
			" 1.323 ,\r\n" + 
			" 1.321 ,\r\n" + 
			" 1.319 ,\r\n" + 
			" 1.318 ,\r\n" + 
			" 1.316 ,\r\n" + 
			" 1.315 ,\r\n" + 
			" 1.314 ,\r\n" + 
			" 1.313 ,\r\n" + 
			" 1.311 ,\r\n" + 
			" 1.310 ,\r\n" + 
			" 1.309 ,\r\n" + 
			" 1.309 ,\r\n" + 
			" 1.308 ,\r\n" + 
			" 1.307 ,\r\n" + 
			" 1.306 ,\r\n" + 
			" 1.306 ,\r\n" + 
			" 1.305 ,\r\n" + 
			" 1.304 ,\r\n" + 
			" 1.304 ,\r\n" + 
			" 1.303 ,\r\n" + 
			" 1.303 ,\r\n" + 
			" 1.302 ,\r\n" + 
			" 1.302 ,\r\n" + 
			" 1.301 ,\r\n" + 
			" 1.301 ,\r\n" + 
			" 1.300 ,\r\n" + 
			" 1.300 ,\r\n" + 
			" 1.299 ,\r\n" + 
			" 1.299 ,\r\n" + 
			" 1.299 ,\r\n" + 
			" 1.298 ,\r\n" + 
			" 1.298 ,\r\n" + 
			" 1.298 ,\r\n" + 
			" 1.297 ,\r\n" + 
			" 1.297 ,\r\n" + 
			" 1.297 ,\r\n" + 
			" 1.297 ,\r\n" + 
			" 1.296 ,\r\n" + 
			" 1.296 ,\r\n" + 
			" 1.296 ,\r\n" + 
			" 1.296 ,\r\n" + 
			" 1.295 ,\r\n" + 
			" 1.295 ,\r\n" + 
			" 1.295 ,\r\n" + 
			" 1.295 ,\r\n" + 
			" 1.295 ,\r\n" + 
			" 1.294 ,\r\n" + 
			" 1.294 ,\r\n" + 
			" 1.294 ,\r\n" + 
			" 1.294 ,\r\n" + 
			" 1.294 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.293 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.292 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.291 ,\r\n" + 
			" 1.290 ,\r\n" + 
			" 1.290 ,\r\n" + 
			" 1.290 ,\r\n" + 
			" 1.290 ,\r\n" + 
			" 1.290 ,\r\n" + 
			" 1.282 \r\n" + 
			"]</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433818457\">val t_table2=\r\n" + 
			"[\r\n" + 
			" 6.314,\r\n" + 
			"  2.920,\r\n" + 
			"  2.353,\r\n" + 
			"  2.132,\r\n" + 
			"  2.015,\r\n" + 
			"  1.943,\r\n" + 
			"  1.895,\r\n" + 
			"  1.860,\r\n" + 
			"  1.833,\r\n" + 
			"  1.812,\r\n" + 
			"  1.796,\r\n" + 
			"  1.782,\r\n" + 
			"  1.771,\r\n" + 
			"  1.761,\r\n" + 
			"  1.753,\r\n" + 
			"  1.746,\r\n" + 
			"  1.740,\r\n" + 
			"  1.734,\r\n" + 
			"  1.729,\r\n" + 
			"  1.725,\r\n" + 
			"  1.721,\r\n" + 
			"  1.717,\r\n" + 
			"  1.714,\r\n" + 
			"  1.711,\r\n" + 
			"  1.708,\r\n" + 
			"  1.706,\r\n" + 
			"  1.703,\r\n" + 
			"  1.701,\r\n" + 
			"  1.699,\r\n" + 
			"  1.697,\r\n" + 
			"  1.696,\r\n" + 
			"  1.694,\r\n" + 
			"  1.692,\r\n" + 
			"  1.691,\r\n" + 
			"  1.690,\r\n" + 
			"  1.688,\r\n" + 
			"  1.687,\r\n" + 
			"  1.686,\r\n" + 
			"  1.685,\r\n" + 
			"  1.684,\r\n" + 
			"  1.683,\r\n" + 
			"  1.682,\r\n" + 
			"  1.681,\r\n" + 
			"  1.680,\r\n" + 
			"  1.679,\r\n" + 
			"  1.679,\r\n" + 
			"  1.678,\r\n" + 
			"  1.677,\r\n" + 
			"  1.677,\r\n" + 
			"  1.676,\r\n" + 
			"  1.675,\r\n" + 
			"  1.675,\r\n" + 
			"  1.674,\r\n" + 
			"  1.674,\r\n" + 
			"  1.673,\r\n" + 
			"  1.673,\r\n" + 
			"  1.672,\r\n" + 
			"  1.672,\r\n" + 
			"  1.671,\r\n" + 
			"  1.671,\r\n" + 
			"  1.670,\r\n" + 
			"  1.670,\r\n" + 
			"  1.669,\r\n" + 
			"  1.669,\r\n" + 
			"  1.669,\r\n" + 
			"  1.668,\r\n" + 
			"  1.668,\r\n" + 
			"  1.668,\r\n" + 
			"  1.667,\r\n" + 
			"  1.667,\r\n" + 
			"  1.667,\r\n" + 
			"  1.666,\r\n" + 
			"  1.666,\r\n" + 
			"  1.666,\r\n" + 
			"  1.665,\r\n" + 
			"  1.665,\r\n" + 
			"  1.665,\r\n" + 
			"  1.665,\r\n" + 
			"  1.664,\r\n" + 
			"  1.664,\r\n" + 
			"  1.664,\r\n" + 
			"  1.664,\r\n" + 
			"  1.663,\r\n" + 
			"  1.663,\r\n" + 
			"  1.663,\r\n" + 
			"  1.663,\r\n" + 
			"  1.663,\r\n" + 
			"  1.662,\r\n" + 
			"  1.662,\r\n" + 
			"  1.662,\r\n" + 
			"  1.662,\r\n" + 
			"  1.662,\r\n" + 
			"  1.661,\r\n" + 
			"  1.661,\r\n" + 
			"  1.661,\r\n" + 
			"  1.661,\r\n" + 
			"  1.661,\r\n" + 
			"  1.661,\r\n" + 
			"  1.660,\r\n" + 
			"  1.660,\r\n" + 
			"  1.645\r\n" + 
			"];\r\n" + 
			"            <layout>(* alfa/2=0.05*)\r\n" + 
			"val t_table2=\r\n" + 
			"[\r\n" + 
			" 6.314,\r\n" + 
			"  2.920,\r\n" + 
			"  2.353,\r\n" + 
			"  2.132,\r\n" + 
			"  2.015,\r\n" + 
			"  1.943,\r\n" + 
			"  1.895,\r\n" + 
			"  1.860,\r\n" + 
			"  1.833,\r\n" + 
			"  1.812,\r\n" + 
			"  1.796,\r\n" + 
			"  1.782,\r\n" + 
			"  1.771,\r\n" + 
			"  1.761,\r\n" + 
			"  1.753,\r\n" + 
			"  1.746,\r\n" + 
			"  1.740,\r\n" + 
			"  1.734,\r\n" + 
			"  1.729,\r\n" + 
			"  1.725,\r\n" + 
			"  1.721,\r\n" + 
			"  1.717,\r\n" + 
			"  1.714,\r\n" + 
			"  1.711,\r\n" + 
			"  1.708,\r\n" + 
			"  1.706,\r\n" + 
			"  1.703,\r\n" + 
			"  1.701,\r\n" + 
			"  1.699,\r\n" + 
			"  1.697,\r\n" + 
			"  1.696,\r\n" + 
			"  1.694,\r\n" + 
			"  1.692,\r\n" + 
			"  1.691,\r\n" + 
			"  1.690,\r\n" + 
			"  1.688,\r\n" + 
			"  1.687,\r\n" + 
			"  1.686,\r\n" + 
			"  1.685,\r\n" + 
			"  1.684,\r\n" + 
			"  1.683,\r\n" + 
			"  1.682,\r\n" + 
			"  1.681,\r\n" + 
			"  1.680,\r\n" + 
			"  1.679,\r\n" + 
			"  1.679,\r\n" + 
			"  1.678,\r\n" + 
			"  1.677,\r\n" + 
			"  1.677,\r\n" + 
			"  1.676,\r\n" + 
			"  1.675,\r\n" + 
			"  1.675,\r\n" + 
			"  1.674,\r\n" + 
			"  1.674,\r\n" + 
			"  1.673,\r\n" + 
			"  1.673,\r\n" + 
			"  1.672,\r\n" + 
			"  1.672,\r\n" + 
			"  1.671,\r\n" + 
			"  1.671,\r\n" + 
			"  1.670,\r\n" + 
			"  1.670,\r\n" + 
			"  1.669,\r\n" + 
			"  1.669,\r\n" + 
			"  1.669,\r\n" + 
			"  1.668,\r\n" + 
			"  1.668,\r\n" + 
			"  1.668,\r\n" + 
			"  1.667,\r\n" + 
			"  1.667,\r\n" + 
			"  1.667,\r\n" + 
			"  1.666,\r\n" + 
			"  1.666,\r\n" + 
			"  1.666,\r\n" + 
			"  1.665,\r\n" + 
			"  1.665,\r\n" + 
			"  1.665,\r\n" + 
			"  1.665,\r\n" + 
			"  1.664,\r\n" + 
			"  1.664,\r\n" + 
			"  1.664,\r\n" + 
			"  1.664,\r\n" + 
			"  1.663,\r\n" + 
			"  1.663,\r\n" + 
			"  1.663,\r\n" + 
			"  1.663,\r\n" + 
			"  1.663,\r\n" + 
			"  1.662,\r\n" + 
			"  1.662,\r\n" + 
			"  1.662,\r\n" + 
			"  1.662,\r\n" + 
			"  1.662,\r\n" + 
			"  1.661,\r\n" + 
			"  1.661,\r\n" + 
			"  1.661,\r\n" + 
			"  1.661,\r\n" + 
			"  1.661,\r\n" + 
			"  1.661,\r\n" + 
			"  1.660,\r\n" + 
			"  1.660,\r\n" + 
			"  1.645\r\n" + 
			"];</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433818893\">val t_table3=\r\n" + 
			"[\r\n" + 
			"12.706 ,\r\n" + 
			" 4.303 ,\r\n" + 
			" 3.182 ,\r\n" + 
			" 2.776 ,\r\n" + 
			" 2.571 ,\r\n" + 
			" 2.447 ,\r\n" + 
			" 2.365 ,\r\n" + 
			" 2.306 ,\r\n" + 
			" 2.262 ,\r\n" + 
			" 2.228 ,\r\n" + 
			" 2.201 ,\r\n" + 
			" 2.179 ,\r\n" + 
			" 2.160 ,\r\n" + 
			" 2.145 ,\r\n" + 
			" 2.131 ,\r\n" + 
			" 2.120 ,\r\n" + 
			" 2.110 ,\r\n" + 
			" 2.101 ,\r\n" + 
			" 2.093 ,\r\n" + 
			" 2.086 ,\r\n" + 
			" 2.080 ,\r\n" + 
			" 2.074 ,\r\n" + 
			" 2.069 ,\r\n" + 
			" 2.064 ,\r\n" + 
			" 2.060 ,\r\n" + 
			" 2.056 ,\r\n" + 
			" 2.052 ,\r\n" + 
			" 2.048 ,\r\n" + 
			" 2.045 ,\r\n" + 
			" 2.042 ,\r\n" + 
			" 2.040 ,\r\n" + 
			" 2.037 ,\r\n" + 
			" 2.035 ,\r\n" + 
			" 2.032 ,\r\n" + 
			" 2.030 ,\r\n" + 
			" 2.028 ,\r\n" + 
			" 2.026 ,\r\n" + 
			" 2.024 ,\r\n" + 
			" 2.023 ,\r\n" + 
			" 2.021 ,\r\n" + 
			" 2.020 ,\r\n" + 
			" 2.018 ,\r\n" + 
			" 2.017 ,\r\n" + 
			" 2.015 ,\r\n" + 
			" 2.014 ,\r\n" + 
			" 2.013 ,\r\n" + 
			" 2.012 ,\r\n" + 
			" 2.011 ,\r\n" + 
			" 2.010 ,\r\n" + 
			" 2.009 ,\r\n" + 
			" 2.008 ,\r\n" + 
			" 2.007 ,\r\n" + 
			" 2.006 ,\r\n" + 
			" 2.005 ,\r\n" + 
			" 2.004 ,\r\n" + 
			" 2.003 ,\r\n" + 
			" 2.002 ,\r\n" + 
			" 2.002 ,\r\n" + 
			" 2.001 ,\r\n" + 
			" 2.000 ,\r\n" + 
			" 2.000 ,\r\n" + 
			" 1.999 ,\r\n" + 
			" 1.998 ,\r\n" + 
			" 1.998 ,\r\n" + 
			" 1.997 ,\r\n" + 
			" 1.997 ,\r\n" + 
			" 1.996 ,\r\n" + 
			" 1.995 ,\r\n" + 
			" 1.995 ,\r\n" + 
			" 1.994 ,\r\n" + 
			" 1.994 ,\r\n" + 
			" 1.993 ,\r\n" + 
			" 1.993 ,\r\n" + 
			" 1.993 ,\r\n" + 
			" 1.992 ,\r\n" + 
			" 1.992 ,\r\n" + 
			" 1.991 ,\r\n" + 
			" 1.991 ,\r\n" + 
			" 1.990 ,\r\n" + 
			" 1.990 ,\r\n" + 
			" 1.990 ,\r\n" + 
			" 1.989 ,\r\n" + 
			" 1.989 ,\r\n" + 
			" 1.989 ,\r\n" + 
			" 1.988 ,\r\n" + 
			" 1.988 ,\r\n" + 
			" 1.988 ,\r\n" + 
			" 1.987 ,\r\n" + 
			" 1.987 ,\r\n" + 
			" 1.987 ,\r\n" + 
			" 1.986 ,\r\n" + 
			" 1.986 ,\r\n" + 
			" 1.986 ,\r\n" + 
			" 1.986 ,\r\n" + 
			" 1.985 ,\r\n" + 
			" 1.985 ,\r\n" + 
			" 1.985 ,\r\n" + 
			" 1.984 ,\r\n" + 
			" 1.984 ,\r\n" + 
			" 1.984 ,\r\n" + 
			" 1.960 \r\n" + 
			"];\r\n" + 
			"            <layout>(* alfa/2=0.025*)\r\n" + 
			"val t_table3=\r\n" + 
			"[\r\n" + 
			"12.706 ,\r\n" + 
			" 4.303 ,\r\n" + 
			" 3.182 ,\r\n" + 
			" 2.776 ,\r\n" + 
			" 2.571 ,\r\n" + 
			" 2.447 ,\r\n" + 
			" 2.365 ,\r\n" + 
			" 2.306 ,\r\n" + 
			" 2.262 ,\r\n" + 
			" 2.228 ,\r\n" + 
			" 2.201 ,\r\n" + 
			" 2.179 ,\r\n" + 
			" 2.160 ,\r\n" + 
			" 2.145 ,\r\n" + 
			" 2.131 ,\r\n" + 
			" 2.120 ,\r\n" + 
			" 2.110 ,\r\n" + 
			" 2.101 ,\r\n" + 
			" 2.093 ,\r\n" + 
			" 2.086 ,\r\n" + 
			" 2.080 ,\r\n" + 
			" 2.074 ,\r\n" + 
			" 2.069 ,\r\n" + 
			" 2.064 ,\r\n" + 
			" 2.060 ,\r\n" + 
			" 2.056 ,\r\n" + 
			" 2.052 ,\r\n" + 
			" 2.048 ,\r\n" + 
			" 2.045 ,\r\n" + 
			" 2.042 ,\r\n" + 
			" 2.040 ,\r\n" + 
			" 2.037 ,\r\n" + 
			" 2.035 ,\r\n" + 
			" 2.032 ,\r\n" + 
			" 2.030 ,\r\n" + 
			" 2.028 ,\r\n" + 
			" 2.026 ,\r\n" + 
			" 2.024 ,\r\n" + 
			" 2.023 ,\r\n" + 
			" 2.021 ,\r\n" + 
			" 2.020 ,\r\n" + 
			" 2.018 ,\r\n" + 
			" 2.017 ,\r\n" + 
			" 2.015 ,\r\n" + 
			" 2.014 ,\r\n" + 
			" 2.013 ,\r\n" + 
			" 2.012 ,\r\n" + 
			" 2.011 ,\r\n" + 
			" 2.010 ,\r\n" + 
			" 2.009 ,\r\n" + 
			" 2.008 ,\r\n" + 
			" 2.007 ,\r\n" + 
			" 2.006 ,\r\n" + 
			" 2.005 ,\r\n" + 
			" 2.004 ,\r\n" + 
			" 2.003 ,\r\n" + 
			" 2.002 ,\r\n" + 
			" 2.002 ,\r\n" + 
			" 2.001 ,\r\n" + 
			" 2.000 ,\r\n" + 
			" 2.000 ,\r\n" + 
			" 1.999 ,\r\n" + 
			" 1.998 ,\r\n" + 
			" 1.998 ,\r\n" + 
			" 1.997 ,\r\n" + 
			" 1.997 ,\r\n" + 
			" 1.996 ,\r\n" + 
			" 1.995 ,\r\n" + 
			" 1.995 ,\r\n" + 
			" 1.994 ,\r\n" + 
			" 1.994 ,\r\n" + 
			" 1.993 ,\r\n" + 
			" 1.993 ,\r\n" + 
			" 1.993 ,\r\n" + 
			" 1.992 ,\r\n" + 
			" 1.992 ,\r\n" + 
			" 1.991 ,\r\n" + 
			" 1.991 ,\r\n" + 
			" 1.990 ,\r\n" + 
			" 1.990 ,\r\n" + 
			" 1.990 ,\r\n" + 
			" 1.989 ,\r\n" + 
			" 1.989 ,\r\n" + 
			" 1.989 ,\r\n" + 
			" 1.988 ,\r\n" + 
			" 1.988 ,\r\n" + 
			" 1.988 ,\r\n" + 
			" 1.987 ,\r\n" + 
			" 1.987 ,\r\n" + 
			" 1.987 ,\r\n" + 
			" 1.986 ,\r\n" + 
			" 1.986 ,\r\n" + 
			" 1.986 ,\r\n" + 
			" 1.986 ,\r\n" + 
			" 1.985 ,\r\n" + 
			" 1.985 ,\r\n" + 
			" 1.985 ,\r\n" + 
			" 1.984 ,\r\n" + 
			" 1.984 ,\r\n" + 
			" 1.984 ,\r\n" + 
			" 1.960 \r\n" + 
			"];</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433819341\">val t_table4=\r\n" + 
			"[\r\n" + 
			"31.821,\r\n" + 
			"  6.965,\r\n" + 
			"  4.541,\r\n" + 
			"  3.747,\r\n" + 
			"  3.365,\r\n" + 
			"  3.143,\r\n" + 
			"  2.998,\r\n" + 
			"  2.896,\r\n" + 
			"  2.821,\r\n" + 
			"  2.764,\r\n" + 
			"  2.718,\r\n" + 
			"  2.681,\r\n" + 
			"  2.650,\r\n" + 
			"  2.624,\r\n" + 
			"  2.602,\r\n" + 
			"  2.583,\r\n" + 
			"  2.567,\r\n" + 
			"  2.552,\r\n" + 
			"  2.539,\r\n" + 
			"  2.528,\r\n" + 
			"  2.518,\r\n" + 
			"  2.508,\r\n" + 
			"  2.500,\r\n" + 
			"  2.492,\r\n" + 
			"  2.485,\r\n" + 
			"  2.479,\r\n" + 
			"  2.473,\r\n" + 
			"  2.467,\r\n" + 
			"  2.462,\r\n" + 
			"  2.457,\r\n" + 
			"  2.453,\r\n" + 
			"  2.449,\r\n" + 
			"  2.445,\r\n" + 
			"  2.441,\r\n" + 
			"  2.438,\r\n" + 
			"  2.434,\r\n" + 
			"  2.431,\r\n" + 
			"  2.429,\r\n" + 
			"  2.426,\r\n" + 
			"  2.423,\r\n" + 
			"  2.421,\r\n" + 
			"  2.418,\r\n" + 
			"  2.416,\r\n" + 
			"  2.414,\r\n" + 
			"  2.412,\r\n" + 
			"  2.410,\r\n" + 
			"  2.408,\r\n" + 
			"  2.407,\r\n" + 
			"  2.405,\r\n" + 
			"  2.403,\r\n" + 
			"  2.402,\r\n" + 
			"  2.400,\r\n" + 
			"  2.399,\r\n" + 
			"  2.397,\r\n" + 
			"  2.396,\r\n" + 
			"  2.395,\r\n" + 
			"  2.394,\r\n" + 
			"  2.392,\r\n" + 
			"  2.391,\r\n" + 
			"  2.390,\r\n" + 
			"  2.389,\r\n" + 
			"  2.388,\r\n" + 
			"  2.387,\r\n" + 
			"  2.386,\r\n" + 
			"  2.385,\r\n" + 
			"  2.384,\r\n" + 
			"  2.383,\r\n" + 
			"  2.382,\r\n" + 
			"  2.382,\r\n" + 
			"  2.381,\r\n" + 
			"  2.380,\r\n" + 
			"  2.379,\r\n" + 
			"  2.379,\r\n" + 
			"  2.378,\r\n" + 
			"  2.377,\r\n" + 
			"  2.376,\r\n" + 
			"  2.376,\r\n" + 
			"  2.375,\r\n" + 
			"  2.374,\r\n" + 
			"  2.374,\r\n" + 
			"  2.373,\r\n" + 
			"  2.373,\r\n" + 
			"  2.372,\r\n" + 
			"  2.372,\r\n" + 
			"  2.371,\r\n" + 
			"  2.370,\r\n" + 
			"  2.370,\r\n" + 
			"  2.369,\r\n" + 
			"  2.369,\r\n" + 
			"  2.368,\r\n" + 
			"  2.368,\r\n" + 
			"  2.368,\r\n" + 
			"  2.367,\r\n" + 
			"  2.367,\r\n" + 
			"  2.366,\r\n" + 
			"  2.366,\r\n" + 
			"  2.365,\r\n" + 
			"  2.365,\r\n" + 
			"  2.365,\r\n" + 
			"  2.364,\r\n" + 
			"  2.326\r\n" + 
			"];\r\n" + 
			"            <layout>(* alfa/2=0.01*)\r\n" + 
			"val t_table4=\r\n" + 
			"[\r\n" + 
			"31.821,\r\n" + 
			"  6.965,\r\n" + 
			"  4.541,\r\n" + 
			"  3.747,\r\n" + 
			"  3.365,\r\n" + 
			"  3.143,\r\n" + 
			"  2.998,\r\n" + 
			"  2.896,\r\n" + 
			"  2.821,\r\n" + 
			"  2.764,\r\n" + 
			"  2.718,\r\n" + 
			"  2.681,\r\n" + 
			"  2.650,\r\n" + 
			"  2.624,\r\n" + 
			"  2.602,\r\n" + 
			"  2.583,\r\n" + 
			"  2.567,\r\n" + 
			"  2.552,\r\n" + 
			"  2.539,\r\n" + 
			"  2.528,\r\n" + 
			"  2.518,\r\n" + 
			"  2.508,\r\n" + 
			"  2.500,\r\n" + 
			"  2.492,\r\n" + 
			"  2.485,\r\n" + 
			"  2.479,\r\n" + 
			"  2.473,\r\n" + 
			"  2.467,\r\n" + 
			"  2.462,\r\n" + 
			"  2.457,\r\n" + 
			"  2.453,\r\n" + 
			"  2.449,\r\n" + 
			"  2.445,\r\n" + 
			"  2.441,\r\n" + 
			"  2.438,\r\n" + 
			"  2.434,\r\n" + 
			"  2.431,\r\n" + 
			"  2.429,\r\n" + 
			"  2.426,\r\n" + 
			"  2.423,\r\n" + 
			"  2.421,\r\n" + 
			"  2.418,\r\n" + 
			"  2.416,\r\n" + 
			"  2.414,\r\n" + 
			"  2.412,\r\n" + 
			"  2.410,\r\n" + 
			"  2.408,\r\n" + 
			"  2.407,\r\n" + 
			"  2.405,\r\n" + 
			"  2.403,\r\n" + 
			"  2.402,\r\n" + 
			"  2.400,\r\n" + 
			"  2.399,\r\n" + 
			"  2.397,\r\n" + 
			"  2.396,\r\n" + 
			"  2.395,\r\n" + 
			"  2.394,\r\n" + 
			"  2.392,\r\n" + 
			"  2.391,\r\n" + 
			"  2.390,\r\n" + 
			"  2.389,\r\n" + 
			"  2.388,\r\n" + 
			"  2.387,\r\n" + 
			"  2.386,\r\n" + 
			"  2.385,\r\n" + 
			"  2.384,\r\n" + 
			"  2.383,\r\n" + 
			"  2.382,\r\n" + 
			"  2.382,\r\n" + 
			"  2.381,\r\n" + 
			"  2.380,\r\n" + 
			"  2.379,\r\n" + 
			"  2.379,\r\n" + 
			"  2.378,\r\n" + 
			"  2.377,\r\n" + 
			"  2.376,\r\n" + 
			"  2.376,\r\n" + 
			"  2.375,\r\n" + 
			"  2.374,\r\n" + 
			"  2.374,\r\n" + 
			"  2.373,\r\n" + 
			"  2.373,\r\n" + 
			"  2.372,\r\n" + 
			"  2.372,\r\n" + 
			"  2.371,\r\n" + 
			"  2.370,\r\n" + 
			"  2.370,\r\n" + 
			"  2.369,\r\n" + 
			"  2.369,\r\n" + 
			"  2.368,\r\n" + 
			"  2.368,\r\n" + 
			"  2.368,\r\n" + 
			"  2.367,\r\n" + 
			"  2.367,\r\n" + 
			"  2.366,\r\n" + 
			"  2.366,\r\n" + 
			"  2.365,\r\n" + 
			"  2.365,\r\n" + 
			"  2.365,\r\n" + 
			"  2.364,\r\n" + 
			"  2.326\r\n" + 
			"];</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433819802\">val t_table5=\r\n" + 
			"[\r\n" + 
			"63.657,\r\n" + 
			" 9.925,\r\n" + 
			" 5.841,\r\n" + 
			" 4.604,\r\n" + 
			" 4.032,\r\n" + 
			" 3.707,\r\n" + 
			" 3.499,\r\n" + 
			" 3.355,\r\n" + 
			" 3.250,\r\n" + 
			" 3.169,\r\n" + 
			" 3.106,\r\n" + 
			" 3.055,\r\n" + 
			" 3.012,\r\n" + 
			" 2.977,\r\n" + 
			" 2.947,\r\n" + 
			" 2.921,\r\n" + 
			" 2.898,\r\n" + 
			" 2.878,\r\n" + 
			" 2.861,\r\n" + 
			" 2.845,\r\n" + 
			" 2.831,\r\n" + 
			" 2.819,\r\n" + 
			" 2.807,\r\n" + 
			" 2.797,\r\n" + 
			" 2.787,\r\n" + 
			" 2.779,\r\n" + 
			" 2.771,\r\n" + 
			" 2.763,\r\n" + 
			" 2.756,\r\n" + 
			" 2.750,\r\n" + 
			" 2.744,\r\n" + 
			" 2.738,\r\n" + 
			" 2.733,\r\n" + 
			" 2.728,\r\n" + 
			" 2.724,\r\n" + 
			" 2.719,\r\n" + 
			" 2.715,\r\n" + 
			" 2.712,\r\n" + 
			" 2.708,\r\n" + 
			" 2.704,\r\n" + 
			" 2.701,\r\n" + 
			" 2.698,\r\n" + 
			" 2.695,\r\n" + 
			" 2.692,\r\n" + 
			" 2.690,\r\n" + 
			" 2.687,\r\n" + 
			" 2.685,\r\n" + 
			" 2.682,\r\n" + 
			" 2.680,\r\n" + 
			" 2.678,\r\n" + 
			" 2.676,\r\n" + 
			" 2.674,\r\n" + 
			" 2.672,\r\n" + 
			" 2.670,\r\n" + 
			" 2.668,\r\n" + 
			" 2.667,\r\n" + 
			" 2.665,\r\n" + 
			" 2.663,\r\n" + 
			" 2.662,\r\n" + 
			" 2.660,\r\n" + 
			" 2.659,\r\n" + 
			" 2.657,\r\n" + 
			" 2.656,\r\n" + 
			" 2.655,\r\n" + 
			" 2.654,\r\n" + 
			" 2.652,\r\n" + 
			" 2.651,\r\n" + 
			" 2.650,\r\n" + 
			" 2.649,\r\n" + 
			" 2.648,\r\n" + 
			" 2.647,\r\n" + 
			" 2.646,\r\n" + 
			" 2.645,\r\n" + 
			" 2.644,\r\n" + 
			" 2.643,\r\n" + 
			" 2.642,\r\n" + 
			" 2.641,\r\n" + 
			" 2.640,\r\n" + 
			" 2.640,\r\n" + 
			" 2.639,\r\n" + 
			" 2.638,\r\n" + 
			" 2.637,\r\n" + 
			" 2.636,\r\n" + 
			" 2.636,\r\n" + 
			" 2.635,\r\n" + 
			" 2.634,\r\n" + 
			" 2.634,\r\n" + 
			" 2.633,\r\n" + 
			" 2.632,\r\n" + 
			" 2.632,\r\n" + 
			" 2.631,\r\n" + 
			" 2.630,\r\n" + 
			" 2.630,\r\n" + 
			" 2.629,\r\n" + 
			" 2.629,\r\n" + 
			" 2.628,\r\n" + 
			" 2.627,\r\n" + 
			" 2.627,\r\n" + 
			" 2.626,\r\n" + 
			" 2.626,\r\n" + 
			" 2.576\r\n" + 
			"];\r\n" + 
			"            <layout>(* alfa/2=0.005*)\r\n" + 
			"val t_table5=\r\n" + 
			"[\r\n" + 
			"63.657,\r\n" + 
			" 9.925,\r\n" + 
			" 5.841,\r\n" + 
			" 4.604,\r\n" + 
			" 4.032,\r\n" + 
			" 3.707,\r\n" + 
			" 3.499,\r\n" + 
			" 3.355,\r\n" + 
			" 3.250,\r\n" + 
			" 3.169,\r\n" + 
			" 3.106,\r\n" + 
			" 3.055,\r\n" + 
			" 3.012,\r\n" + 
			" 2.977,\r\n" + 
			" 2.947,\r\n" + 
			" 2.921,\r\n" + 
			" 2.898,\r\n" + 
			" 2.878,\r\n" + 
			" 2.861,\r\n" + 
			" 2.845,\r\n" + 
			" 2.831,\r\n" + 
			" 2.819,\r\n" + 
			" 2.807,\r\n" + 
			" 2.797,\r\n" + 
			" 2.787,\r\n" + 
			" 2.779,\r\n" + 
			" 2.771,\r\n" + 
			" 2.763,\r\n" + 
			" 2.756,\r\n" + 
			" 2.750,\r\n" + 
			" 2.744,\r\n" + 
			" 2.738,\r\n" + 
			" 2.733,\r\n" + 
			" 2.728,\r\n" + 
			" 2.724,\r\n" + 
			" 2.719,\r\n" + 
			" 2.715,\r\n" + 
			" 2.712,\r\n" + 
			" 2.708,\r\n" + 
			" 2.704,\r\n" + 
			" 2.701,\r\n" + 
			" 2.698,\r\n" + 
			" 2.695,\r\n" + 
			" 2.692,\r\n" + 
			" 2.690,\r\n" + 
			" 2.687,\r\n" + 
			" 2.685,\r\n" + 
			" 2.682,\r\n" + 
			" 2.680,\r\n" + 
			" 2.678,\r\n" + 
			" 2.676,\r\n" + 
			" 2.674,\r\n" + 
			" 2.672,\r\n" + 
			" 2.670,\r\n" + 
			" 2.668,\r\n" + 
			" 2.667,\r\n" + 
			" 2.665,\r\n" + 
			" 2.663,\r\n" + 
			" 2.662,\r\n" + 
			" 2.660,\r\n" + 
			" 2.659,\r\n" + 
			" 2.657,\r\n" + 
			" 2.656,\r\n" + 
			" 2.655,\r\n" + 
			" 2.654,\r\n" + 
			" 2.652,\r\n" + 
			" 2.651,\r\n" + 
			" 2.650,\r\n" + 
			" 2.649,\r\n" + 
			" 2.648,\r\n" + 
			" 2.647,\r\n" + 
			" 2.646,\r\n" + 
			" 2.645,\r\n" + 
			" 2.644,\r\n" + 
			" 2.643,\r\n" + 
			" 2.642,\r\n" + 
			" 2.641,\r\n" + 
			" 2.640,\r\n" + 
			" 2.640,\r\n" + 
			" 2.639,\r\n" + 
			" 2.638,\r\n" + 
			" 2.637,\r\n" + 
			" 2.636,\r\n" + 
			" 2.636,\r\n" + 
			" 2.635,\r\n" + 
			" 2.634,\r\n" + 
			" 2.634,\r\n" + 
			" 2.633,\r\n" + 
			" 2.632,\r\n" + 
			" 2.632,\r\n" + 
			" 2.631,\r\n" + 
			" 2.630,\r\n" + 
			" 2.630,\r\n" + 
			" 2.629,\r\n" + 
			" 2.629,\r\n" + 
			" 2.628,\r\n" + 
			" 2.627,\r\n" + 
			" 2.627,\r\n" + 
			" 2.626,\r\n" + 
			" 2.626,\r\n" + 
			" 2.576\r\n" + 
			"];</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433820279\">val t_table6=\r\n" + 
			"[\r\n" + 
			"318.313,\r\n" + 
			" 22.327,\r\n" + 
			" 10.215,\r\n" + 
			"  7.173,\r\n" + 
			"  5.893,\r\n" + 
			"  5.208,\r\n" + 
			"  4.782,\r\n" + 
			"  4.499,\r\n" + 
			"  4.296,\r\n" + 
			"  4.143,\r\n" + 
			"  4.024,\r\n" + 
			"  3.929,\r\n" + 
			"  3.852,\r\n" + 
			"  3.787,\r\n" + 
			"  3.733,\r\n" + 
			"  3.686,\r\n" + 
			"  3.646,\r\n" + 
			"  3.610,\r\n" + 
			"  3.579,\r\n" + 
			"  3.552,\r\n" + 
			"  3.527,\r\n" + 
			"  3.505,\r\n" + 
			"  3.485,\r\n" + 
			"  3.467,\r\n" + 
			"  3.450,\r\n" + 
			"  3.435,\r\n" + 
			"  3.421,\r\n" + 
			"  3.408,\r\n" + 
			"  3.396,\r\n" + 
			"  3.385,\r\n" + 
			"  3.375,\r\n" + 
			"  3.365,\r\n" + 
			"  3.356,\r\n" + 
			"  3.348,\r\n" + 
			"  3.340,\r\n" + 
			"  3.333,\r\n" + 
			"  3.326,\r\n" + 
			"  3.319,\r\n" + 
			"  3.313,\r\n" + 
			"  3.307,\r\n" + 
			"  3.301,\r\n" + 
			"  3.296,\r\n" + 
			"  3.291,\r\n" + 
			"  3.286,\r\n" + 
			"  3.281,\r\n" + 
			"  3.277,\r\n" + 
			"  3.273,\r\n" + 
			"  3.269,\r\n" + 
			"  3.265,\r\n" + 
			"  3.261,\r\n" + 
			"  3.258,\r\n" + 
			"  3.255,\r\n" + 
			"  3.251,\r\n" + 
			"  3.248,\r\n" + 
			"  3.245,\r\n" + 
			"  3.242,\r\n" + 
			"  3.239,\r\n" + 
			"  3.237,\r\n" + 
			"  3.234,\r\n" + 
			"  3.232,\r\n" + 
			"  3.229,\r\n" + 
			"  3.227,\r\n" + 
			"  3.225,\r\n" + 
			"  3.223,\r\n" + 
			"  3.220,\r\n" + 
			"  3.218,\r\n" + 
			"  3.216,\r\n" + 
			"  3.214,\r\n" + 
			"  3.213,\r\n" + 
			"  3.211,\r\n" + 
			"  3.209,\r\n" + 
			"  3.207,\r\n" + 
			"  3.206,\r\n" + 
			"  3.204,\r\n" + 
			"  3.202,\r\n" + 
			"  3.201,\r\n" + 
			"  3.199,\r\n" + 
			"  3.198,\r\n" + 
			"  3.197,\r\n" + 
			"  3.195,\r\n" + 
			"  3.194,\r\n" + 
			"  3.193,\r\n" + 
			"  3.191,\r\n" + 
			"  3.190,\r\n" + 
			"  3.189,\r\n" + 
			"  3.188,\r\n" + 
			"  3.187,\r\n" + 
			"  3.185,\r\n" + 
			"  3.184,\r\n" + 
			"  3.183,\r\n" + 
			"  3.182,\r\n" + 
			"  3.181,\r\n" + 
			"  3.180,\r\n" + 
			"  3.179,\r\n" + 
			"  3.178,\r\n" + 
			"  3.177,\r\n" + 
			"  3.176,\r\n" + 
			"  3.175,\r\n" + 
			"  3.175,\r\n" + 
			"  3.174,\r\n" + 
			"  3.090\r\n" + 
			"];\r\n" + 
			"            <layout>(* alfa/2=0.001*)\r\n" + 
			"val t_table6=\r\n" + 
			"[\r\n" + 
			"318.313,\r\n" + 
			" 22.327,\r\n" + 
			" 10.215,\r\n" + 
			"  7.173,\r\n" + 
			"  5.893,\r\n" + 
			"  5.208,\r\n" + 
			"  4.782,\r\n" + 
			"  4.499,\r\n" + 
			"  4.296,\r\n" + 
			"  4.143,\r\n" + 
			"  4.024,\r\n" + 
			"  3.929,\r\n" + 
			"  3.852,\r\n" + 
			"  3.787,\r\n" + 
			"  3.733,\r\n" + 
			"  3.686,\r\n" + 
			"  3.646,\r\n" + 
			"  3.610,\r\n" + 
			"  3.579,\r\n" + 
			"  3.552,\r\n" + 
			"  3.527,\r\n" + 
			"  3.505,\r\n" + 
			"  3.485,\r\n" + 
			"  3.467,\r\n" + 
			"  3.450,\r\n" + 
			"  3.435,\r\n" + 
			"  3.421,\r\n" + 
			"  3.408,\r\n" + 
			"  3.396,\r\n" + 
			"  3.385,\r\n" + 
			"  3.375,\r\n" + 
			"  3.365,\r\n" + 
			"  3.356,\r\n" + 
			"  3.348,\r\n" + 
			"  3.340,\r\n" + 
			"  3.333,\r\n" + 
			"  3.326,\r\n" + 
			"  3.319,\r\n" + 
			"  3.313,\r\n" + 
			"  3.307,\r\n" + 
			"  3.301,\r\n" + 
			"  3.296,\r\n" + 
			"  3.291,\r\n" + 
			"  3.286,\r\n" + 
			"  3.281,\r\n" + 
			"  3.277,\r\n" + 
			"  3.273,\r\n" + 
			"  3.269,\r\n" + 
			"  3.265,\r\n" + 
			"  3.261,\r\n" + 
			"  3.258,\r\n" + 
			"  3.255,\r\n" + 
			"  3.251,\r\n" + 
			"  3.248,\r\n" + 
			"  3.245,\r\n" + 
			"  3.242,\r\n" + 
			"  3.239,\r\n" + 
			"  3.237,\r\n" + 
			"  3.234,\r\n" + 
			"  3.232,\r\n" + 
			"  3.229,\r\n" + 
			"  3.227,\r\n" + 
			"  3.225,\r\n" + 
			"  3.223,\r\n" + 
			"  3.220,\r\n" + 
			"  3.218,\r\n" + 
			"  3.216,\r\n" + 
			"  3.214,\r\n" + 
			"  3.213,\r\n" + 
			"  3.211,\r\n" + 
			"  3.209,\r\n" + 
			"  3.207,\r\n" + 
			"  3.206,\r\n" + 
			"  3.204,\r\n" + 
			"  3.202,\r\n" + 
			"  3.201,\r\n" + 
			"  3.199,\r\n" + 
			"  3.198,\r\n" + 
			"  3.197,\r\n" + 
			"  3.195,\r\n" + 
			"  3.194,\r\n" + 
			"  3.193,\r\n" + 
			"  3.191,\r\n" + 
			"  3.190,\r\n" + 
			"  3.189,\r\n" + 
			"  3.188,\r\n" + 
			"  3.187,\r\n" + 
			"  3.185,\r\n" + 
			"  3.184,\r\n" + 
			"  3.183,\r\n" + 
			"  3.182,\r\n" + 
			"  3.181,\r\n" + 
			"  3.180,\r\n" + 
			"  3.179,\r\n" + 
			"  3.178,\r\n" + 
			"  3.177,\r\n" + 
			"  3.176,\r\n" + 
			"  3.175,\r\n" + 
			"  3.175,\r\n" + 
			"  3.174,\r\n" + 
			"  3.090\r\n" + 
			"];</layout>\r\n" + 
			"          </ml>\r\n" + 
			"        </block>\r\n" + 
			"        <ml id=\"ID1433820763\">val CI =0.95;\r\n" + 
			"          <layout>(* Conf Interval *)\r\n" + 
			"val CI =0.95;</layout>\r\n" + 
			"        </ml>\r\n" + 
			"      </block>\r\n" + 
			"      <block id=\"ID1433821004\">\r\n" + 
			"        <id>Func</id>\r\n" + 
			"        <block id=\"ID1433821496\">\r\n" + 
			"          <id>Analysis</id>\r\n" + 
			"          <ml id=\"ID1433823633\">fun average(l) =  \r\n" + 
			"(\r\n" + 
			" let\r\n" + 
			"   fun aux(nil ,sum,len) = sum / Real.fromInt(len)\r\n" + 
			"   |   aux(h::t,sum,len) = aux(t,sum+h,len+1)\r\n" + 
			" in \r\n" + 
			"   aux(l,0.0,0) \r\n" + 
			" end\r\n" + 
			");\r\n" + 
			"            <layout>(* Average of a List*)\r\n" + 
			"fun average(l) =  \r\n" + 
			"(\r\n" + 
			" let\r\n" + 
			"   fun aux(nil ,sum,len) = sum / Real.fromInt(len)\r\n" + 
			"   |   aux(h::t,sum,len) = aux(t,sum+h,len+1)\r\n" + 
			" in \r\n" + 
			"   aux(l,0.0,0) \r\n" + 
			" end\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433823910\">fun variance (l) =\r\n" + 
			"(\r\n" + 
			" let\r\n" + 
			"  val m = average(l);\r\n" + 
			"  fun aux(nil, sum, len) = sum / Real.fromInt(len-1)\r\n" + 
			"  |     aux(h::t,sum,len) = aux(t, sum + Math.pow(m - h,2.0),len+1)\r\n" + 
			" in\r\n" + 
			"   aux(l,0.0,0)\r\n" + 
			" end\r\n" + 
			");\r\n" + 
			"            <layout>(* Variance of a List*)\r\n" + 
			"fun variance (l) =\r\n" + 
			"(\r\n" + 
			" let\r\n" + 
			"  val m = average(l);\r\n" + 
			"  fun aux(nil, sum, len) = sum / Real.fromInt(len-1)\r\n" + 
			"  |     aux(h::t,sum,len) = aux(t, sum + Math.pow(m - h,2.0),len+1)\r\n" + 
			" in\r\n" + 
			"   aux(l,0.0,0)\r\n" + 
			" end\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433824191\">fun Tstudent(alfa, grau) =\r\n" + 
			"(\r\n" + 
			" case alfa of \r\n" + 
			"    &quot;0.2&quot; =&gt; List.nth(t_table1,grau-1)\r\n" + 
			"  | &quot;0.1&quot; =&gt; List.nth(t_table2,grau-1)\r\n" + 
			"  | &quot;0.05&quot; =&gt; List.nth(t_table3,grau-1)\r\n" + 
			"  | &quot;0.02&quot; =&gt; List.nth(t_table4,grau-1)\r\n" + 
			"  | &quot;0.01&quot; =&gt; List.nth(t_table5,grau-1)\r\n" + 
			"  | &quot;0.002&quot; =&gt; List.nth(t_table6,grau-1)\r\n" + 
			"  | _  =&gt; 0.0\r\n" + 
			");\r\n" + 
			"            <layout>(* Returns the value of T-Student  \r\n" + 
			"1 - alfa/2 *)\r\n" + 
			"fun Tstudent(alfa, grau) =\r\n" + 
			"(\r\n" + 
			" case alfa of \r\n" + 
			"    &quot;0.2&quot; =&gt; List.nth(t_table1,grau-1)\r\n" + 
			"  | &quot;0.1&quot; =&gt; List.nth(t_table2,grau-1)\r\n" + 
			"  | &quot;0.05&quot; =&gt; List.nth(t_table3,grau-1)\r\n" + 
			"  | &quot;0.02&quot; =&gt; List.nth(t_table4,grau-1)\r\n" + 
			"  | &quot;0.01&quot; =&gt; List.nth(t_table5,grau-1)\r\n" + 
			"  | &quot;0.002&quot; =&gt; List.nth(t_table6,grau-1)\r\n" + 
			"  | _  =&gt; 0.0\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433824474\">fun standardDeviation(l) =\r\n" + 
			"(\r\n" + 
			" let \r\n" + 
			"  val v = variance(l);\r\n" + 
			" in\r\n" + 
			"  Math.pow(v,0.5)  \r\n" + 
			" end  \r\n" + 
			");\r\n" + 
			"            <layout>(* Standard Deviation of a List *)\r\n" + 
			"fun standardDeviation(l) =\r\n" + 
			"(\r\n" + 
			" let \r\n" + 
			"  val v = variance(l);\r\n" + 
			" in\r\n" + 
			"  Math.pow(v,0.5)  \r\n" + 
			" end  \r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433824760\">fun standardError(l)=\r\n" + 
			"(\r\n" + 
			"let \r\n" + 
			"  val t =(\r\n" + 
			"                if !nReplicationExec&gt;100\r\n" + 
			"                   then \r\n" + 
			"                     Tstudent(Real.toString (1.0 - CI),101) \r\n" + 
			"                   else  \r\n" + 
			"                      if !nReplicationExec&gt;2\r\n" + 
			"                      then\r\n" + 
			"                        Tstudent(Real.toString (1.0 - CI),!nReplicationExec-2)\r\n" + 
			"                     else\r\n" + 
			"                        Tstudent(Real.toString (1.0 - CI),!nReplicationExec)\r\n" + 
			"              );\r\n" + 
			"in\r\n" + 
			"  t*standardDeviation(l)/Math.pow(Real.fromInt(!nReplicationExec-1),0.5)\r\n" + 
			"end\r\n" + 
			");\r\n" + 
			"            <layout>(*Standard Error of a List*)\r\n" + 
			"fun standardError(l)=\r\n" + 
			"(\r\n" + 
			"let \r\n" + 
			"  val t =(\r\n" + 
			"                if !nReplicationExec&gt;100\r\n" + 
			"                   then \r\n" + 
			"                     Tstudent(Real.toString (1.0 - CI),101) \r\n" + 
			"                   else  \r\n" + 
			"                      if !nReplicationExec&gt;2\r\n" + 
			"                      then\r\n" + 
			"                        Tstudent(Real.toString (1.0 - CI),!nReplicationExec-2)\r\n" + 
			"                     else\r\n" + 
			"                        Tstudent(Real.toString (1.0 - CI),!nReplicationExec)\r\n" + 
			"              );\r\n" + 
			"in\r\n" + 
			"  t*standardDeviation(l)/Math.pow(Real.fromInt(!nReplicationExec-1),0.5)\r\n" + 
			"end\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433825049\">fun absPreReplication(l,value)=\r\n" + 
			"(\r\n" + 
			"let \r\n" + 
			"  val t =(\r\n" + 
			"                if !nReplicationExec&gt;100\r\n" + 
			"                   then \r\n" + 
			"                     Tstudent(Real.toString (1.0 - CI),101) \r\n" + 
			"                   else \r\n" + 
			"                      if !nReplicationExec&gt;2 \r\n" + 
			"                      then\r\n" + 
			"                        Tstudent(Real.toString (1.0 - CI),!nReplicationExec-2)\r\n" + 
			"                      else\r\n" + 
			"                        Tstudent(Real.toString (1.0 - CI),!nReplicationExec)\r\n" + 
			"            );\r\n" + 
			"in\r\n" + 
			"  Real.ceil(Math.pow(t*standardDeviation(l)/value,2.0))\r\n" + 
			"end\r\n" + 
			");\r\n" + 
			"            <layout>(*Calc for Absolute Precision using nReplication formula*)\r\n" + 
			"fun absPreReplication(l,value)=\r\n" + 
			"(\r\n" + 
			"let \r\n" + 
			"  val t =(\r\n" + 
			"                if !nReplicationExec&gt;100\r\n" + 
			"                   then \r\n" + 
			"                     Tstudent(Real.toString (1.0 - CI),101) \r\n" + 
			"                   else \r\n" + 
			"                      if !nReplicationExec&gt;2 \r\n" + 
			"                      then\r\n" + 
			"                        Tstudent(Real.toString (1.0 - CI),!nReplicationExec-2)\r\n" + 
			"                      else\r\n" + 
			"                        Tstudent(Real.toString (1.0 - CI),!nReplicationExec)\r\n" + 
			"            );\r\n" + 
			"in\r\n" + 
			"  Real.ceil(Math.pow(t*standardDeviation(l)/value,2.0))\r\n" + 
			"end\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"        </block>\r\n" + 
			"        <block id=\"ID1433825338\">\r\n" + 
			"          <id>Simulator</id>\r\n" + 
			"          <ml id=\"ID1433828463\">fun pop(l : int list ) = \r\n" + 
			"(\r\n" + 
			"let val resp = (\r\n" + 
			"                      if List.length(l)&gt;0 then\r\n" + 
			"                        List.take(l, List.length(l)-1)\r\n" + 
			"                      else\r\n" + 
			"                         !startPos\r\n" + 
			"                      );\r\n" + 
			"in\r\n" + 
			"  startPos:=resp\r\n" + 
			"end\r\n" + 
			");\r\n" + 
			"            <layout>(* Returns first n-1 elements of list startPos *)\r\n" + 
			"fun pop(l : int list ) = \r\n" + 
			"(\r\n" + 
			"let val resp = (\r\n" + 
			"                      if List.length(l)&gt;0 then\r\n" + 
			"                        List.take(l, List.length(l)-1)\r\n" + 
			"                      else\r\n" + 
			"                         !startPos\r\n" + 
			"                      );\r\n" + 
			"in\r\n" + 
			"  startPos:=resp\r\n" + 
			"end\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433828788\">fun push(data : int) =\r\n" + 
			"(\r\n" + 
			"startPos:=  !startPos^^[data]\r\n" + 
			");\r\n" + 
			"            <layout>(* Push a data into startPos *)\r\n" + 
			"fun push(data : int) =\r\n" + 
			"(\r\n" + 
			"startPos:=  !startPos^^[data]\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433829117\">fun writeFile1(log)= \r\n" + 
			"(  \r\n" + 
			" let \r\n" + 
			"     val File=TextIO.openAppend(&quot;StatsA.log&quot;) \r\n" + 
			"   in\r\n" + 
			"     if (!firstWrite) then (\r\n" + 
			"       firstWrite:=false;\r\n" + 
			"       TextIO.output(File,&quot;Numero de Replicao\\tEnergia Media\\n &quot;);\r\n" + 
			"       TextIO.output(File,log)\r\n" + 
			"     )else\r\n" + 
			"       TextIO.output(File,log);\r\n" + 
			"     TextIO.closeOut(File)\r\n" + 
			" end\r\n" + 
			");\r\n" + 
			"            <layout>(* Write the text passed by parameter in the file*)\r\n" + 
			"fun writeFile1(log)= \r\n" + 
			"(  \r\n" + 
			" let \r\n" + 
			"     val File=TextIO.openAppend(&quot;StatsA.log&quot;) \r\n" + 
			"   in\r\n" + 
			"     if (!firstWrite) then (\r\n" + 
			"       firstWrite:=false;\r\n" + 
			"       TextIO.output(File,&quot;Numero de Replicao\\tEnergia Media\\n &quot;);\r\n" + 
			"       TextIO.output(File,log)\r\n" + 
			"     )else\r\n" + 
			"       TextIO.output(File,log);\r\n" + 
			"     TextIO.closeOut(File)\r\n" + 
			" end\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433829448\">fun addMeanData(c : real) =\r\n" + 
			"(\r\n" + 
			" meanEnergyList:= [c] ^^ !meanEnergyList\r\n" + 
			");\r\n" + 
			"            <layout>(*Adds the mean data of one replication*)\r\n" + 
			"fun addMeanData(c : real) =\r\n" + 
			"(\r\n" + 
			" meanEnergyList:= [c] ^^ !meanEnergyList\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433829783\">fun newIter() = \r\n" + 
			"(\r\n" + 
			"  energy:=0.0\r\n" + 
			");\r\n" + 
			"            <layout>(* Begins a new iteration *)\r\n" + 
			"fun newIter() = \r\n" + 
			"(\r\n" + 
			"  energy:=0.0\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433830120\">fun addData(ene : real)=\r\n" + 
			"(\r\n" + 
			"energy:=(!energy)+ene\r\n" + 
			");\r\n" + 
			"            <layout>(*Adds data for simulation*)\r\n" + 
			"fun addData(ene : real)=\r\n" + 
			"(\r\n" + 
			"energy:=(!energy)+ene\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433830460\">fun checkEnd() = \r\n" + 
			"(\r\n" + 
			"let\r\n" + 
			"val ener=average(!energyList);\r\n" + 
			"val energyError=standardError(!meanEnergyList);\r\n" + 
			"\r\n" + 
			"in\r\n" + 
			"  if (!nIterExec &lt; 30)\r\n" + 
			"   then(\r\n" + 
			"     inc nIterExec;\r\n" + 
			"     false\r\n" + 
			"   )\r\n" + 
			"  else(\r\n" + 
			"     if (!nReplicationExec &lt;= !nReplication) then(\r\n" + 
			"        addMeanData(ener);\r\n" + 
			"        nIterExec:=0;\r\n" + 
			"        writeFile1(&quot;\\t&quot; ^ Int.toString (!nReplicationExec) ^ &quot;\\t&quot; ^\r\n" + 
			"                    &quot;\\t\\t\\t&quot; ^ Real.toString ener ^ &quot;\\n&quot; );\r\n" + 
			"        energyList:=nil;\r\n" + 
			"       \r\n" + 
			"        nReplicationExec:=(!nReplicationExec)+1;\r\n" + 
			"        false\r\n" + 
			"     )\r\n" + 
			"     else(\r\n" + 
			"        (*Checks if founded error is less than the desire error*)\r\n" + 
			"        if energyError&lt;absPreEner then\r\n" + 
			"          true(*Finish the simulation*)\r\n" + 
			"        else(\r\n" + 
			"          (*Calc the new number of replication needed*)\r\n" + 
			"            energyNewReplication:=absPreReplication(!meanEnergyList, absPreEner);\r\n" + 
			"            writeFile1(&quot;\\n QuanRepet: &quot; ^ Int.toString(!energyNewReplication) ^ &quot;\\n&quot;);\r\n" + 
			"              nReplication := !nReplication + !energyNewReplication;\r\n" + 
			"            \r\n" + 
			"            \r\n" + 
			"            energyList:=nil;\r\n" + 
			"            nIterExec:=0;\r\n" + 
			"            false\r\n" + 
			"            \r\n" + 
			"         )\r\n" + 
			"       )\r\n" + 
			"     \r\n" + 
			"  )\r\n" + 
			"end\r\n" + 
			");\r\n" + 
			"            <layout>(* Checks if It is in the desire precision of energy and time errors *)\r\n" + 
			"fun checkEnd() = \r\n" + 
			"(\r\n" + 
			"let\r\n" + 
			"val ener=average(!energyList);\r\n" + 
			"val energyError=standardError(!meanEnergyList);\r\n" + 
			"\r\n" + 
			"in\r\n" + 
			"  if (!nIterExec &lt; 30)\r\n" + 
			"   then(\r\n" + 
			"     inc nIterExec;\r\n" + 
			"     false\r\n" + 
			"   )\r\n" + 
			"  else(\r\n" + 
			"     if (!nReplicationExec &lt;= !nReplication) then(\r\n" + 
			"        addMeanData(ener);\r\n" + 
			"        nIterExec:=0;\r\n" + 
			"        writeFile1(&quot;\\t&quot; ^ Int.toString (!nReplicationExec) ^ &quot;\\t&quot; ^\r\n" + 
			"                    &quot;\\t\\t\\t&quot; ^ Real.toString ener ^ &quot;\\n&quot; );\r\n" + 
			"        energyList:=nil;\r\n" + 
			"       \r\n" + 
			"        nReplicationExec:=(!nReplicationExec)+1;\r\n" + 
			"        false\r\n" + 
			"     )\r\n" + 
			"     else(\r\n" + 
			"        (*Checks if founded error is less than the desire error*)\r\n" + 
			"        if energyError&lt;absPreEner then\r\n" + 
			"          true(*Finish the simulation*)\r\n" + 
			"        else(\r\n" + 
			"          (*Calc the new number of replication needed*)\r\n" + 
			"            energyNewReplication:=absPreReplication(!meanEnergyList, absPreEner);\r\n" + 
			"            writeFile1(&quot;\\n QuanRepet: &quot; ^ Int.toString(!energyNewReplication) ^ &quot;\\n&quot;);\r\n" + 
			"              nReplication := !nReplication + !energyNewReplication;\r\n" + 
			"            \r\n" + 
			"            \r\n" + 
			"            energyList:=nil;\r\n" + 
			"            nIterExec:=0;\r\n" + 
			"            false\r\n" + 
			"            \r\n" + 
			"         )\r\n" + 
			"       )\r\n" + 
			"     \r\n" + 
			"  )\r\n" + 
			"end\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"          <ml id=\"ID1433830803\">fun addIterData(c : real) =\r\n" + 
			"(\r\n" + 
			" energyList:= [c] ^^ !energyList\r\n" + 
			");\r\n" + 
			"            <layout>(*Adds data of iteration*)\r\n" + 
			"fun addIterData(c : real) =\r\n" + 
			"(\r\n" + 
			" energyList:= [c] ^^ !energyList\r\n" + 
			");</layout>\r\n" + 
			"          </ml>\r\n" + 
			"        </block>\r\n" + 
			"      </block>\r\n" + 
			"    </globbox>\r\n" + 
			"";
	
	String subpageTrans = "     <constraints/>\r\n" + 
			"    </page>" +
			"<page id=\"ID1434576890\">\r\n" + 
			"      <pageattr name=\"Transition\"/>\r\n" + 
			"      <place id=\"ID1434576892\">\r\n" + 
			"        <posattr x=\"-1443.000000\"\r\n" + 
			"                 y=\"-110.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>02S</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-10.000000\"\r\n" + 
			"               y=\"0.000000\"/>\r\n" + 
			"        <marking x=\"218.000000\"\r\n" + 
			"                 y=\"59.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"0\"\r\n" + 
			"                anchor.vertical=\"0\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1434576893\">\r\n" + 
			"          <posattr x=\"-1443.000000\"\r\n" + 
			"                   y=\"-141.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">REQUIREMENT_LIST</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1434576894\">\r\n" + 
			"          <posattr x=\"-1386.000000\"\r\n" + 
			"                   y=\"-86.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </initmark>\r\n" + 
			"      </place>\r\n" + 
			"      <place id=\"ID1434576917\">\r\n" + 
			"        <posattr x=\"-1444.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>03S</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-44.000000\"\r\n" + 
			"               y=\"24.000000\"/>\r\n" + 
			"        <marking x=\"133.000000\"\r\n" + 
			"                 y=\"95.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"0\"\r\n" + 
			"                anchor.vertical=\"0\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1434576918\">\r\n" + 
			"          <posattr x=\"-1444.000000\"\r\n" + 
			"                   y=\"-31.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">COMPONENT</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1434576919\">\r\n" + 
			"          <posattr x=\"-1387.000000\"\r\n" + 
			"                   y=\"23.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </initmark>\r\n" + 
			"        <port id=\"ID1434577027\"\r\n" + 
			"              type=\"I/O\">\r\n" + 
			"          <posattr x=\"-1447.000000\"\r\n" + 
			"                   y=\"-13.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </port>\r\n" + 
			"      </place>\r\n" + 
			"      <place id=\"ID1434576922\">\r\n" + 
			"        <posattr x=\"-1159.000000\"\r\n" + 
			"                 y=\"72.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>02</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-10.000000\"\r\n" + 
			"               y=\"0.000000\"/>\r\n" + 
			"        <marking x=\"-28.000000\"\r\n" + 
			"                 y=\"81.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"0\"\r\n" + 
			"                anchor.vertical=\"0\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1434576923\">\r\n" + 
			"          <posattr x=\"-1158.000000\"\r\n" + 
			"                   y=\"28.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">REQUIREMENT_LIST</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1434576924\">\r\n" + 
			"          <posattr x=\"-1102.000000\"\r\n" + 
			"                   y=\"95.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </initmark>\r\n" + 
			"        <port id=\"ID1434577030\"\r\n" + 
			"              type=\"Out\">\r\n" + 
			"          <posattr x=\"-1183.000000\"\r\n" + 
			"                   y=\"55.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </port>\r\n" + 
			"      </place>\r\n" + 
			"      <place id=\"ID1434576927\">\r\n" + 
			"        <posattr x=\"-1444.000000\"\r\n" + 
			"                 y=\"168.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>05S</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"14.000000\"\r\n" + 
			"               y=\"15.000000\"/>\r\n" + 
			"        <marking x=\"2.000000\"\r\n" + 
			"                 y=\"-18.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"1\"\r\n" + 
			"                anchor.vertical=\"3\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1434576928\">\r\n" + 
			"          <posattr x=\"-1440.000000\"\r\n" + 
			"                   y=\"127.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">COMPONENT</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1434576929\">\r\n" + 
			"          <posattr x=\"-1387.000000\"\r\n" + 
			"                   y=\"191.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </initmark>\r\n" + 
			"        <port id=\"ID1434577034\"\r\n" + 
			"              type=\"I/O\">\r\n" + 
			"          <posattr x=\"-1449.000000\"\r\n" + 
			"                   y=\"153.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </port>\r\n" + 
			"      </place>\r\n" + 
			"      <place id=\"ID1434576936\">\r\n" + 
			"        <posattr x=\"-1691.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>01</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-19.000000\"\r\n" + 
			"               y=\"-16.000000\"/>\r\n" + 
			"        <marking x=\"-24.000000\"\r\n" + 
			"                 y=\"54.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"3\"\r\n" + 
			"                anchor.vertical=\"2\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1434576937\">\r\n" + 
			"          <posattr x=\"-1690.000000\"\r\n" + 
			"                   y=\"-41.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">REQUIREMENT_LIST</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1434576938\">\r\n" + 
			"          <posattr x=\"-1659.000000\"\r\n" + 
			"                   y=\"23.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">ini</text>\r\n" + 
			"        </initmark>\r\n" + 
			"        <port id=\"ID1434577037\"\r\n" + 
			"              type=\"In\">\r\n" + 
			"          <posattr x=\"-1715.000000\"\r\n" + 
			"                   y=\"-16.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </port>\r\n" + 
			"      </place>\r\n" + 
			"      <trans id=\"ID1434576895\"\r\n" + 
			"             explicit=\"false\">\r\n" + 
			"        <posattr x=\"-1625.000000\"\r\n" + 
			"                 y=\"-110.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>T01</text>\r\n" + 
			"        <box w=\"60.000000\"\r\n" + 
			"             h=\"40.000000\"/>\r\n" + 
			"        <binding x=\"7.200000\"\r\n" + 
			"                 y=\"-3.000000\"/>\r\n" + 
			"        <cond id=\"ID1434576896\">\r\n" + 
			"          <posattr x=\"-1664.000000\"\r\n" + 
			"                   y=\"-79.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </cond>\r\n" + 
			"        <time id=\"ID1434576897\">\r\n" + 
			"          <posattr x=\"-1567.500000\"\r\n" + 
			"                   y=\"-90.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">@+50</text>\r\n" + 
			"        </time>\r\n" + 
			"        <code id=\"ID1434576898\">\r\n" + 
			"          <posattr x=\"-1472.500000\"\r\n" + 
			"                   y=\"-191.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">input (reqs,c);\r\n" + 
			"output ();\r\n" + 
			"action\r\n" + 
			"let\r\n" + 
			"val x=List.nth(reqs,2) val powerIn=(#2 x)\r\n" + 
			"in\r\n" + 
			"veriPower(powerIn,(#potMax c),(#name c))\r\n" + 
			"end</text>\r\n" + 
			"        </code>\r\n" + 
			"        <priority id=\"ID1434576900\">\r\n" + 
			"          <posattr x=\"-1649.000000\"\r\n" + 
			"                   y=\"-141.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">P_HIGH</text>\r\n" + 
			"        </priority>\r\n" + 
			"      </trans>\r\n" + 
			"      <trans id=\"ID1434576901\"\r\n" + 
			"             explicit=\"false\">\r\n" + 
			"        <posattr x=\"-1218.000000\"\r\n" + 
			"                 y=\"-110.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>T02</text>\r\n" + 
			"        <box w=\"60.000000\"\r\n" + 
			"             h=\"40.000000\"/>\r\n" + 
			"        <binding x=\"7.200000\"\r\n" + 
			"                 y=\"-3.000000\"/>\r\n" + 
			"        <cond id=\"ID"+ ++idCond+"\">\r\n" + 
			"          <posattr x=\"-1421.500000\"\r\n" + 
			"                   y=\"-68.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">[let val x=List.nth(reqs,2) val t=(#2 x) in t &lt; (#potMax c) end]</text>\r\n" + 
			"        </cond>\r\n" + 
			"        <time id=\"ID"+ ++idTime+"\">\r\n" + 
			"          <posattr x=\"-1183.500000\"\r\n" + 
			"                   y=\"-79.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">@+50</text>\r\n" + 
			"        </time>\r\n" + 
			"        <code id=\"ID"+ ++idCode+"\">\r\n" + 
			"          <posattr x=\"-1153.500000\"\r\n" + 
			"                   y=\"-162.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </code>\r\n" + 
			"        <priority id=\"ID"+ ++idPriority+"\">\r\n" + 
			"          <posattr x=\"-1276.000000\"\r\n" + 
			"                   y=\"-141.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">P_HIGH</text>\r\n" + 
			"        </priority>\r\n" + 
			"      </trans>\r\n" + 
			"      <trans id=\"ID1434576907\"\r\n" + 
			"             explicit=\"false\">\r\n" + 
			"        <posattr x=\"-1444.000000\"\r\n" + 
			"                 y=\"84.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>Status</text>\r\n" + 
			"        <box w=\"60.000000\"\r\n" + 
			"             h=\"40.000000\"/>\r\n" + 
			"        <subst subpage=\"ID1434574964\"\r\n" + 
			"               portsock=\"(ID1434574985,ID1434576927)(ID1434574990,ID1434576917)\">\r\n" + 
			"          <subpageinfo id=\"ID1434577015\"\r\n" + 
			"                       name=\"Status\">\r\n" + 
			"            <posattr x=\"-1444.000000\"\r\n" + 
			"                     y=\"60.000000\"/>\r\n" + 
			"            <fillattr colour=\"White\"\r\n" + 
			"                      pattern=\"Solid\"\r\n" + 
			"                      filled=\"false\"/>\r\n" + 
			"            <lineattr colour=\"Black\"\r\n" + 
			"                      thick=\"0\"\r\n" + 
			"                      type=\"Solid\"/>\r\n" + 
			"            <textattr colour=\"Black\"\r\n" + 
			"                      bold=\"false\"/>\r\n" + 
			"          </subpageinfo>\r\n" + 
			"        </subst>\r\n" + 
			"        <binding x=\"7.200000\"\r\n" + 
			"                 y=\"-3.000000\"/>\r\n" + 
			"        <cond id=\"ID1434576908\">\r\n" + 
			"          <posattr x=\"-1483.000000\"\r\n" + 
			"                   y=\"115.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </cond>\r\n" + 
			"        <time id=\"ID1434576909\">\r\n" + 
			"          <posattr x=\"-1399.500000\"\r\n" + 
			"                   y=\"115.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </time>\r\n" + 
			"        <code id=\"ID1434576910\">\r\n" + 
			"          <posattr x=\"-1379.500000\"\r\n" + 
			"                   y=\"32.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </code>\r\n" + 
			"        <priority id=\"ID1434576912\">\r\n" + 
			"          <posattr x=\"-1512.000000\"\r\n" + 
			"                   y=\"53.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </priority>\r\n" + 
			"      </trans>\r\n" + 
			"      <arc id=\"ID1434576913\"\r\n" + 
			"           orientation=\"TtoP\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434576895\"/>\r\n" + 
			"        <placeend idref=\"ID1434576892\"/>\r\n" + 
			"        <annot id=\"ID1434576914\">\r\n" + 
			"          <posattr x=\"-1533.000000\"\r\n" + 
			"                   y=\"-121.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">calcPwproc(reqs,c)</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434576915\"\r\n" + 
			"           orientation=\"PtoT\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434576901\"/>\r\n" + 
			"        <placeend idref=\"ID1434576892\"/>\r\n" + 
			"        <annot id=\"ID1434576916\">\r\n" + 
			"          <posattr x=\"-1336.000000\"\r\n" + 
			"                   y=\"-121.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">reqs</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434576920\"\r\n" + 
			"           orientation=\"BOTHDIR\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434576895\"/>\r\n" + 
			"        <placeend idref=\"ID1434576917\"/>\r\n" + 
			"        <bendpoint id=\"ID1434576873\"\r\n" + 
			"                   serial=\"1\">\r\n" + 
			"          <posattr x=\"-1625.000000\"\r\n" + 
			"                   y=\"0.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </bendpoint>\r\n" + 
			"        <annot id=\"ID1434576921\">\r\n" + 
			"          <posattr x=\"-1632.000000\"\r\n" + 
			"                   y=\"-52.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">c</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434576925\"\r\n" + 
			"           orientation=\"TtoP\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434576901\"/>\r\n" + 
			"        <placeend idref=\"ID1434576922\"/>\r\n" + 
			"        <bendpoint id=\"ID1434993848\"\r\n" + 
			"                   serial=\"1\">\r\n" + 
			"          <posattr x=\"-1159.000000\"\r\n" + 
			"                   y=\"-110.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </bendpoint>\r\n" + 
			"        <annot id=\"ID1434576926\">\r\n" + 
			"          <posattr x=\"-1145.000000\"\r\n" + 
			"                   y=\"-27.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">calcAcExerproc(reqs,c)</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434576930\"\r\n" + 
			"           orientation=\"BOTHDIR\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434576907\"/>\r\n" + 
			"        <placeend idref=\"ID1434576927\"/>\r\n" + 
			"        <annot id=\"ID1434576931\">\r\n" + 
			"          <posattr x=\"-1536.000000\"\r\n" + 
			"                   y=\"190.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434576932\"\r\n" + 
			"           orientation=\"BOTHDIR\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434576901\"/>\r\n" + 
			"        <placeend idref=\"ID1434576917\"/>\r\n" + 
			"        <bendpoint id=\"ID1434576874\"\r\n" + 
			"                   serial=\"1\">\r\n" + 
			"          <posattr x=\"-1218.000000\"\r\n" + 
			"                   y=\"0.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </bendpoint>\r\n" + 
			"        <annot id=\"ID1434576933\">\r\n" + 
			"          <posattr x=\"-1211.000000\"\r\n" + 
			"                   y=\"-45.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">c</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434576934\"\r\n" + 
			"           orientation=\"TtoP\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434576907\"/>\r\n" + 
			"        <placeend idref=\"ID1434576917\"/>\r\n" + 
			"        <annot id=\"ID1434576935\">\r\n" + 
			"          <posattr x=\"-1494.000000\"\r\n" + 
			"                   y=\"71.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434576939\"\r\n" + 
			"           orientation=\"PtoT\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434576895\"/>\r\n" + 
			"        <placeend idref=\"ID1434576936\"/>\r\n" + 
			"        <bendpoint id=\"ID1434989596\"\r\n" + 
			"                   serial=\"1\">\r\n" + 
			"          <posattr x=\"-1691.000000\"\r\n" + 
			"                   y=\"-110.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </bendpoint>\r\n" + 
			"        <annot id=\"ID1434576940\">\r\n" + 
			"          <posattr x=\"-1673.000000\"\r\n" + 
			"                   y=\"-121.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">reqs</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <constraints/>\r\n" + 
			"    </page>\r\n" + 
			"    ";
			
	String subpageFinal = "<page id=\"ID1436734986\">\r\n" + 
			"      <pageattr name=\"Group 2\"/>\r\n" + 
			"      <place id=\"ID1436734988\">\r\n" + 
			"        <posattr x=\"-1573.000000\"\r\n" + 
			"                 y=\"-252.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text></text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-10.000000\"\r\n" + 
			"               y=\"0.000000\"/>\r\n" + 
			"        <marking x=\"-38.000000\"\r\n" + 
			"                 y=\"62.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"0\"\r\n" + 
			"                anchor.vertical=\"0\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1436734989\">\r\n" + 
			"          <posattr x=\"-1573.000000\"\r\n" + 
			"                   y=\"-283.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">REQUIREMENT_LIST</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1436734990\">\r\n" + 
			"          <posattr x=\"-1516.000000\"\r\n" + 
			"                   y=\"-228.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </initmark>\r\n" + 
			"      </place>\r\n" + 
			"      <place id=\"ID1436734991\">\r\n" + 
			"        <posattr x=\"-1824.000000\"\r\n" + 
			"                 y=\"-252.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>06</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-10.000000\"\r\n" + 
			"               y=\"0.000000\"/>\r\n" + 
			"        <marking x=\"-132.000000\"\r\n" + 
			"                 y=\"-20.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"0\"\r\n" + 
			"                anchor.vertical=\"0\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1436734992\">\r\n" + 
			"          <posattr x=\"-1824.000000\"\r\n" + 
			"                   y=\"-283.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">REQUIREMENT_LIST</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1436734993\">\r\n" + 
			"          <posattr x=\"-1767.000000\"\r\n" + 
			"                   y=\"-228.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </initmark>\r\n" + 
			"      </place>\r\n" + 
			"      <place id=\"ID1436735020\">\r\n" + 
			"        <posattr x=\"-1638.000000\"\r\n" + 
			"                 y=\"-42.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>03</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-10.000000\"\r\n" + 
			"               y=\"0.000000\"/>\r\n" + 
			"        <marking x=\"79.000000\"\r\n" + 
			"                 y=\"-40.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"0\"\r\n" + 
			"                anchor.vertical=\"0\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1436735021\">\r\n" + 
			"          <posattr x=\"-1636.000000\"\r\n" + 
			"                   y=\"-84.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">REQUIREMENT_LIST</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1436735022\">\r\n" + 
			"          <posattr x=\"-1581.000000\"\r\n" + 
			"                   y=\"-18.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </initmark>\r\n" + 
			"        <port id=\"ID1436735084\"\r\n" + 
			"              type=\"In\">\r\n" + 
			"          <posattr x=\"-1662.000000\"\r\n" + 
			"                   y=\"-58.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </port>\r\n" + 
			"      </place>\r\n" + 
			"      <place id=\"ID1436735025\">\r\n" + 
			"        <posattr x=\"-1932.000000\"\r\n" + 
			"                 y=\"-126.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>01</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-19.000000\"\r\n" + 
			"               y=\"-16.000000\"/>\r\n" + 
			"        <marking x=\"-81.000000\"\r\n" + 
			"                 y=\"215.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"0\"\r\n" + 
			"                anchor.vertical=\"0\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1436735026\">\r\n" + 
			"          <posattr x=\"-1946.000000\"\r\n" + 
			"                   y=\"-162.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">REQUIREMENT_LIST</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1436735027\">\r\n" + 
			"          <posattr x=\"-1900.000000\"\r\n" + 
			"                   y=\"-102.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">ini</text>\r\n" + 
			"        </initmark>\r\n" + 
			"        <port id=\"ID1436735088\"\r\n" + 
			"              type=\"Out\">\r\n" + 
			"          <posattr x=\"-1956.000000\"\r\n" + 
			"                   y=\"-142.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </port>\r\n" + 
			"      </place>\r\n" + 
			"      <trans id=\"ID1436734994\"\r\n" + 
			"             explicit=\"false\">\r\n" + 
			"        <posattr x=\"-1668.000000\"\r\n" + 
			"                 y=\"-252.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text></text>\r\n" + 
			"        <box w=\"60.000000\"\r\n" + 
			"             h=\"40.000000\"/>\r\n" + 
			"        <binding x=\"7.200000\"\r\n" + 
			"                 y=\"-3.000000\"/>\r\n" + 
			"        <cond id=\"ID1436734995\">\r\n" + 
			"          <posattr x=\"-1707.000000\"\r\n" + 
			"                   y=\"-221.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </cond>\r\n" + 
			"        <time id=\"ID1436734996\">\r\n" + 
			"          <posattr x=\"-1623.500000\"\r\n" + 
			"                   y=\"-221.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </time>\r\n" + 
			"        <code id=\"ID1436734997\">\r\n" + 
			"          <posattr x=\"-1603.500000\"\r\n" + 
			"                   y=\"-304.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </code>\r\n" + 
			"        <priority id=\"ID1436734999\">\r\n" + 
			"          <posattr x=\"-1726.000000\"\r\n" + 
			"                   y=\"-283.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">P_HIGH</text>\r\n" + 
			"        </priority>\r\n" + 
			"      </trans>\r\n" + 
			"      <trans id=\"ID1436735000\"\r\n" + 
			"             explicit=\"false\">\r\n" + 
			"        <posattr x=\"-1932.000000\"\r\n" + 
			"                 y=\"-252.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>Reset</text>\r\n" + 
			"        <box w=\"60.000000\"\r\n" + 
			"             h=\"40.000000\"/>\r\n" + 
			"        <binding x=\"7.200000\"\r\n" + 
			"                 y=\"-3.000000\"/>\r\n" + 
			"        <cond id=\"ID1436735001\">\r\n" + 
			"          <posattr x=\"-1971.000000\"\r\n" + 
			"                   y=\"-221.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </cond>\r\n" + 
			"        <time id=\"ID1436735002\">\r\n" + 
			"          <posattr x=\"-1887.500000\"\r\n" + 
			"                   y=\"-221.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </time>\r\n" + 
			"        <code id=\"ID1436735003\">\r\n" + 
			"          <posattr x=\"-1699.000000\"\r\n" + 
			"                   y=\"-451.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">input (reqs);\r\n" + 
			"output ();\r\n" + 
			"action\r\n" + 
			"let val powerEnd = List.nth(reqs,2);\r\n" + 
			"val powerEndd = (#2 powerEnd);\r\n" + 
			"val meanPower=average(!meanEnergyList); \r\n" + 
			"val powerError=standardError(!meanEnergyList);\r\n" + 
			"val powerSD=standardDeviation(!meanEnergyList);\r\n" + 
			"in\r\n" + 
			"addIterData(powerEndd) ;\r\n" + 
			"writeFile(&quot;\\n\\n&quot; ^ Real.toString powerEndd ^ &quot;\\n&quot; );\r\n" + 
			"if checkEnd() then(\r\n" + 
			"  isEnd:=1;\r\n" + 
			"  writeFile1(&quot;\\n\\nMedia Global Da Energia: &quot; ^ Real.toString meanPower^ &quot;\\n&quot; ^\r\n" + 
			"                &quot;Desvio Padro da Energia: &quot; ^ Real.toString powerSD ^ &quot;\\n&quot; ^\r\n" + 
			"                &quot;Erro da Energia &quot; ^ Real.toString powerError ^ &quot;\\n&quot; ^\r\n" + 
			"                &quot;\\n&quot;)\r\n" + 
			")\r\n" + 
			"else\r\n" + 
			"   newIter();\r\n" + 
			"  isEnd:=0\r\n" + 
			"end;</text>\r\n" + 
			"        </code>\r\n" + 
			"        <priority id=\"ID1436735005\">\r\n" + 
			"          <posattr x=\"-1976.000000\"\r\n" + 
			"                   y=\"-283.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">P_HIGH</text>\r\n" + 
			"        </priority>\r\n" + 
			"      </trans>\r\n" + 
			"      <trans id=\"ID1436735006\"\r\n" + 
			"             explicit=\"false\">\r\n" + 
			"        <posattr x=\"-1428.000000\"\r\n" + 
			"                 y=\"-252.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text></text>\r\n" + 
			"        <box w=\"62.000000\"\r\n" + 
			"             h=\"40.000000\"/>\r\n" + 
			"        <binding x=\"7.200000\"\r\n" + 
			"                 y=\"-3.000000\"/>\r\n" + 
			"        <cond id=\"ID1436735007\">\r\n" + 
			"          <posattr x=\"-1468.000000\"\r\n" + 
			"                   y=\"-221.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </cond>\r\n" + 
			"        <time id=\"ID1436735008\">\r\n" + 
			"          <posattr x=\"-1382.500000\"\r\n" + 
			"                   y=\"-221.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </time>\r\n" + 
			"        <code id=\"ID1436735009\">\r\n" + 
			"          <posattr x=\"-1362.500000\"\r\n" + 
			"                   y=\"-304.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </code>\r\n" + 
			"        <priority id=\"ID1436735011\">\r\n" + 
			"          <posattr x=\"-1464.000000\"\r\n" + 
			"                   y=\"-285.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">P_HIGH</text>\r\n" + 
			"        </priority>\r\n" + 
			"      </trans>\r\n" + 
			"      <arc id=\"ID1436735012\"\r\n" + 
			"           orientation=\"TtoP\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1436735006\"/>\r\n" + 
			"        <placeend idref=\"ID1436734988\"/>\r\n" + 
			"        <annot id=\"ID1436735013\">\r\n" + 
			"          <posattr x=\"-1459.000000\"\r\n" + 
			"                   y=\"-252.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">calcTotproc(reqs)</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1436735014\"\r\n" + 
			"           orientation=\"TtoP\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1436734994\"/>\r\n" + 
			"        <placeend idref=\"ID1436734991\"/>\r\n" + 
			"        <annot id=\"ID1436735015\">\r\n" + 
			"          <posattr x=\"-1698.000000\"\r\n" + 
			"                   y=\"-252.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">calcOpeproc(reqs)</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1436735016\"\r\n" + 
			"           orientation=\"PtoT\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1436734994\"/>\r\n" + 
			"        <placeend idref=\"ID1436734988\"/>\r\n" + 
			"        <annot id=\"ID1436735017\">\r\n" + 
			"          <posattr x=\"-1638.000000\"\r\n" + 
			"                   y=\"-252.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">reqs</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1436735018\"\r\n" + 
			"           orientation=\"PtoT\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1436735000\"/>\r\n" + 
			"        <placeend idref=\"ID1436734991\"/>\r\n" + 
			"        <annot id=\"ID1436735019\">\r\n" + 
			"          <posattr x=\"-1902.000000\"\r\n" + 
			"                   y=\"-252.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">reqs</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1436735023\"\r\n" + 
			"           orientation=\"PtoT\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1436735006\"/>\r\n" + 
			"        <placeend idref=\"ID1436735020\"/>\r\n" + 
			"        <annot id=\"ID1436735024\">\r\n" + 
			"          <posattr x=\"-1521.000000\"\r\n" + 
			"                   y=\"-132.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">reqs</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1436735028\"\r\n" + 
			"           orientation=\"TtoP\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1436735000\"/>\r\n" + 
			"        <placeend idref=\"ID1436735025\"/>\r\n" + 
			"        <annot id=\"ID1436735029\">\r\n" + 
			"          <posattr x=\"-1921.000000\"\r\n" + 
			"                   y=\"-189.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">ini</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <constraints/>\r\n" + 
			"    </page>\r\n" + 
			"    ";
	
	String subpageSts = "<page id=\"ID1434574964\">\r\n" + 
			"      <pageattr name=\"Status\"/>\r\n" + 
			"      <place id=\"ID1434574966\">\r\n" + 
			"        <posattr x=\"-1512.000000\"\r\n" + 
			"                 y=\"126.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>04S</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-10.000000\"\r\n" + 
			"               y=\"0.000000\"/>\r\n" + 
			"        <marking x=\"-188.000000\"\r\n" + 
			"                 y=\"213.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"0\"\r\n" + 
			"                anchor.vertical=\"0\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1434574967\">\r\n" + 
			"          <posattr x=\"-1515.000000\"\r\n" + 
			"                   y=\"76.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">COMPONENT</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1434574968\">\r\n" + 
			"          <posattr x=\"-1455.000000\"\r\n" + 
			"                   y=\"149.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </initmark>\r\n" + 
			"      </place>\r\n" + 
			"      <place id=\"ID1434574985\">\r\n" + 
			"        <posattr x=\"-1512.000000\"\r\n" + 
			"                 y=\"221.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>05S</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-10.000000\"\r\n" + 
			"               y=\"0.000000\"/>\r\n" + 
			"        <marking x=\"-9.000000\"\r\n" + 
			"                 y=\"75.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"1\"\r\n" + 
			"                anchor.vertical=\"2\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1434574986\">\r\n" + 
			"          <posattr x=\"-1512.000000\"\r\n" + 
			"                   y=\"190.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">COMPONENT</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1434574987\">\r\n" + 
			"          <posattr x=\"-1455.000000\"\r\n" + 
			"                   y=\"244.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </initmark>\r\n" + 
			"        <port id=\"ID1434575043\"\r\n" + 
			"              type=\"I/O\">\r\n" + 
			"          <posattr x=\"-1536.000000\"\r\n" + 
			"                   y=\"204.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </port>\r\n" + 
			"      </place>\r\n" + 
			"      <place id=\"ID1434574990\">\r\n" + 
			"        <posattr x=\"-1512.000000\"\r\n" + 
			"                 y=\"42.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>03S</text>\r\n" + 
			"        <ellipse w=\"60.000000\"\r\n" + 
			"                 h=\"40.000000\"/>\r\n" + 
			"        <token x=\"-44.000000\"\r\n" + 
			"               y=\"24.000000\"/>\r\n" + 
			"        <marking x=\"133.000000\"\r\n" + 
			"                 y=\"95.000000\"\r\n" + 
			"                 hidden=\"false\">\r\n" + 
			"          <snap snap_id=\"0\"\r\n" + 
			"                anchor.horizontal=\"0\"\r\n" + 
			"                anchor.vertical=\"0\"/>\r\n" + 
			"        </marking>\r\n" + 
			"        <type id=\"ID1434574991\">\r\n" + 
			"          <posattr x=\"-1502.000000\"\r\n" + 
			"                   y=\"0.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">COMPONENT</text>\r\n" + 
			"        </type>\r\n" + 
			"        <initmark id=\"ID1434574992\">\r\n" + 
			"          <posattr x=\"-1455.000000\"\r\n" + 
			"                   y=\"65.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </initmark>\r\n" + 
			"        <port id=\"ID1434575047\"\r\n" + 
			"              type=\"Out\">\r\n" + 
			"          <posattr x=\"-1536.000000\"\r\n" + 
			"                   y=\"25.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </port>\r\n" + 
			"      </place>\r\n" + 
			"      <trans id=\"ID1434574969\"\r\n" + 
			"             explicit=\"false\">\r\n" + 
			"        <posattr x=\"-1626.000000\"\r\n" + 
			"                 y=\"126.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>T04</text>\r\n" + 
			"        <box w=\"60.000000\"\r\n" + 
			"             h=\"40.000000\"/>\r\n" + 
			"        <binding x=\"7.200000\"\r\n" + 
			"                 y=\"-3.000000\"/>\r\n" + 
			"        <cond id=\"ID1434574970\">\r\n" + 
			"          <posattr x=\"-1665.000000\"\r\n" + 
			"                   y=\"157.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </cond>\r\n" + 
			"        <time id=\"ID1434574971\">\r\n" + 
			"          <posattr x=\"-1617.000000\"\r\n" + 
			"                   y=\"172.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">@+(#MTTR_INT c)</text>\r\n" + 
			"        </time>\r\n" + 
			"        <code id=\"ID1434574972\">\r\n" + 
			"          <posattr x=\"-1561.500000\"\r\n" + 
			"                   y=\"74.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </code>\r\n" + 
			"        <priority id=\"ID1434574974\">\r\n" + 
			"          <posattr x=\"-1694.000000\"\r\n" + 
			"                   y=\"95.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </priority>\r\n" + 
			"      </trans>\r\n" + 
			"      <trans id=\"ID1434574975\"\r\n" + 
			"             explicit=\"false\">\r\n" + 
			"        <posattr x=\"-1415.000000\"\r\n" + 
			"                 y=\"126.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <text>T03</text>\r\n" + 
			"        <box w=\"60.000000\"\r\n" + 
			"             h=\"40.000000\"/>\r\n" + 
			"        <binding x=\"7.200000\"\r\n" + 
			"                 y=\"-3.000000\"/>\r\n" + 
			"        <cond id=\"ID1434574976\">\r\n" + 
			"          <posattr x=\"-1454.000000\"\r\n" + 
			"                   y=\"157.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </cond>\r\n" + 
			"        <time id=\"ID1434574977\">\r\n" + 
			"          <posattr x=\"-1415.000000\"\r\n" + 
			"                   y=\"157.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">@+(#MTTF_INT c)</text>\r\n" + 
			"        </time>\r\n" + 
			"        <code id=\"ID1434574978\">\r\n" + 
			"          <posattr x=\"-1350.500000\"\r\n" + 
			"                   y=\"74.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </code>\r\n" + 
			"        <priority id=\"ID1434574980\">\r\n" + 
			"          <posattr x=\"-1483.000000\"\r\n" + 
			"                   y=\"95.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </priority>\r\n" + 
			"      </trans>\r\n" + 
			"      <arc id=\"ID1434574981\"\r\n" + 
			"           orientation=\"TtoP\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434574969\"/>\r\n" + 
			"        <placeend idref=\"ID1434574966\"/>\r\n" + 
			"        <annot id=\"ID1434574982\">\r\n" + 
			"          <posattr x=\"-1565.000000\"\r\n" + 
			"                   y=\"97.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">reevalStateOn(c)</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434574983\"\r\n" + 
			"           orientation=\"PtoT\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434574975\"/>\r\n" + 
			"        <placeend idref=\"ID1434574966\"/>\r\n" + 
			"        <annot id=\"ID1434574984\">\r\n" + 
			"          <posattr x=\"-1460.000000\"\r\n" + 
			"                   y=\"137.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">c</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434574988\"\r\n" + 
			"           orientation=\"PtoT\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434574969\"/>\r\n" + 
			"        <placeend idref=\"ID1434574985\"/>\r\n" + 
			"        <bendpoint id=\"ID1434574950\"\r\n" + 
			"                   serial=\"1\">\r\n" + 
			"          <posattr x=\"-1626.000000\"\r\n" + 
			"                   y=\"221.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </bendpoint>\r\n" + 
			"        <annot id=\"ID1434574989\">\r\n" + 
			"          <posattr x=\"-1633.000000\"\r\n" + 
			"                   y=\"191.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">c</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434574993\"\r\n" + 
			"           orientation=\"TtoP\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434574969\"/>\r\n" + 
			"        <placeend idref=\"ID1434574990\"/>\r\n" + 
			"        <bendpoint id=\"ID1434574951\"\r\n" + 
			"                   serial=\"1\">\r\n" + 
			"          <posattr x=\"-1626.000000\"\r\n" + 
			"                   y=\"42.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </bendpoint>\r\n" + 
			"        <annot id=\"ID1434574994\">\r\n" + 
			"          <posattr x=\"-1625.000000\"\r\n" + 
			"                   y=\"66.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">reevalStateOn(c)</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434574995\"\r\n" + 
			"           orientation=\"TtoP\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434574975\"/>\r\n" + 
			"        <placeend idref=\"ID1434574990\"/>\r\n" + 
			"        <bendpoint id=\"ID1434574952\"\r\n" + 
			"                   serial=\"1\">\r\n" + 
			"          <posattr x=\"-1415.000000\"\r\n" + 
			"                   y=\"42.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </bendpoint>\r\n" + 
			"        <annot id=\"ID1434574996\">\r\n" + 
			"          <posattr x=\"-1417.000000\"\r\n" + 
			"                   y=\"69.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">reevalStateOff(c)</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <arc id=\"ID1434574997\"\r\n" + 
			"           orientation=\"TtoP\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434574975\"/>\r\n" + 
			"        <placeend idref=\"ID1434574985\"/>\r\n" + 
			"        <bendpoint id=\"ID1434574953\"\r\n" + 
			"                   serial=\"1\">\r\n" + 
			"          <posattr x=\"-1415.000000\"\r\n" + 
			"                   y=\"221.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"        </bendpoint>\r\n" + 
			"        <annot id=\"ID1434574998\">\r\n" + 
			"          <posattr x=\"-1410.000000\"\r\n" + 
			"                   y=\"190.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\">reevalStateOff(c)</text>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>\r\n" + 
			"      <constraints/>\r\n" + 
			"    </page>\r\n" + 
			"    ";
	
	String instancia = "";
	
	ArrayList<Integer> instanciasIDs = new ArrayList();
	//ArrayList<Integer> placeIDs = new ArrayList();
	
	
	String fim = "	<options>\r\n" + 
			"      <option name=\"realtimestamp\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"fair_be\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"global_fairness\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"outputdirectory\">\r\n" + 
			"        <value>\r\n" + 
			"          <text>&lt;same as model&gt;</text>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"extensions.10005.enable\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"extensions.10006.enable\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"extensions.10002.enable\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"extensions.10003.enable\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"extensions.10001.enable\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repavg\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repciavg\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repcount\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repfirstval\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"replastval\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repmax\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repmin\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repssquare\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repssqdev\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repstddev\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repsum\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"repvariance\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"avg\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"ciavg\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"count\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"firstval\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"lastval\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"max\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"min\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"ssquare\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"ssqdev\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"stddev\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"sum\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"variance\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"firstupdate\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"interval\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"lastupdate\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedavg\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedciavg\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedcount\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedfirstval\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedlastval\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedmax\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedmin\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedssquare\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedssqdev\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedstddev\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedsum\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>true</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"      <option name=\"untimedvariance\">\r\n" + 
			"        <value>\r\n" + 
			"          <boolean>false</boolean>\r\n" + 
			"        </value>\r\n" + 
			"      </option>\r\n" + 
			"    </options>\r\n" + 
			"    <binders/>\r\n" + 
			"    <monitorblock name=\"Monitors\"/>\r\n" + 
			"    <IndexNode expanded=\"false\">\r\n" + 
			"      <IndexNode expanded=\"true\"/>\r\n" + 
			"      <IndexNode expanded=\"true\"/>\r\n" + 
			"      <IndexNode expanded=\"false\">\r\n" + 
			"        <IndexNode expanded=\"false\"/>\r\n" + 
			"        <IndexNode expanded=\"false\"/>\r\n" + 
			"        <IndexNode expanded=\"false\"/>\r\n" + 
			"        <IndexNode expanded=\"false\"/>\r\n" + 
			"        <IndexNode expanded=\"false\">\r\n" + 
			"          <IndexNode expanded=\"true\">\r\n" + 
			"            <IndexNode expanded=\"false\">\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"            </IndexNode>\r\n" + 
			"            <IndexNode expanded=\"false\">\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"              <IndexNode expanded=\"false\"/>\r\n" + 
			"            </IndexNode>\r\n" + 
			"          </IndexNode>\r\n" + 
			"          <IndexNode expanded=\"false\">\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"          </IndexNode>\r\n" + 
			"        </IndexNode>\r\n" + 
			"        <IndexNode expanded=\"false\">\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"        </IndexNode>\r\n" + 
			"      </IndexNode>\r\n" + 
			"      <IndexNode expanded=\"false\">\r\n" + 
			"        <IndexNode expanded=\"false\"/>\r\n" + 
			"      </IndexNode>\r\n" + 
			"      <IndexNode expanded=\"true\">\r\n" + 
			"        <IndexNode expanded=\"false\">\r\n" + 
			"          <IndexNode expanded=\"true\"/>\r\n" + 
			"          <IndexNode expanded=\"true\"/>\r\n" + 
			"          <IndexNode expanded=\"true\"/>\r\n" + 
			"        </IndexNode>\r\n" + 
			"        <IndexNode expanded=\"false\">\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"true\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"true\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"        </IndexNode>\r\n" + 
			"        <IndexNode expanded=\"false\">\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"        </IndexNode>\r\n" + 
			"        <IndexNode expanded=\"false\">\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"        </IndexNode>\r\n" + 
			"        <IndexNode expanded=\"false\">\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"true\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"        </IndexNode>\r\n" + 
			"        <IndexNode expanded=\"false\">\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"        </IndexNode>\r\n" + 
			"        <IndexNode expanded=\"false\">\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"          <IndexNode expanded=\"false\">\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"          </IndexNode>\r\n" + 
			"          <IndexNode expanded=\"false\"/>\r\n" + 
			"        </IndexNode>\r\n" + 
			"        <IndexNode expanded=\"false\">\r\n" + 
			"          <IndexNode expanded=\"false\">\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"          </IndexNode>\r\n" + 
			"          <IndexNode expanded=\"false\">\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"            <IndexNode expanded=\"false\"/>\r\n" + 
			"          </IndexNode>\r\n" + 
			"        </IndexNode>\r\n" + 
			"      </IndexNode>\r\n" + 
			"      <IndexNode expanded=\"false\"/>\r\n" + 
			"      <IndexNode expanded=\"false\">\r\n" + 
			"        <IndexNode expanded=\"true\"/>\r\n" + 
			"        <IndexNode expanded=\"true\">\r\n" + 
			"          <IndexNode expanded=\"true\"/>\r\n" + 
			"        </IndexNode>\r\n" + 
			"      </IndexNode>\r\n" + 
			"    </IndexNode>\r\n" + 
			"  </cpnet>\r\n" + 
			"</workspaceElements>";
	
	public String gerarMainpage(Componente comp_atual) {
		String compTipo = comp_atual.getTipoComp();
		System.out.println(compTipo);
		if(compTipo=="UPS_5kVA"){
			compTipo = "UPS";
		}
		if(compTipo=="UPS_250kVA"){
			compTipo = "UPS";
		}
		if(compTipo=="SDTransformer"){
			compTipo = "SDT";
		}
		if(compTipo=="SubPanel"){
			compTipo = "SB";
		}
		if(compTipo=="PowerStrip"){
			compTipo = "PS";
		}
		
		String mainpage = "<page id=\"ID6\">\r\n" + 
				"<pageattr name=\"System\"/>\r\n" + 
				"      <place id=\"ID1422669894\">\r\n" + 
				"        <posattr x=\"-1932.000000\"\r\n" + 
				"                 y=\"-126.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <text>01</text>\r\n" + 
				"        <ellipse w=\"60.000000\"\r\n" + 
				"                 h=\"40.000000\"/>\r\n" + 
				"        <token x=\"-19.000000\"\r\n" + 
				"               y=\"-16.000000\"/>\r\n" + 
				"        <marking x=\"-81.000000\"\r\n" + 
				"                 y=\"215.000000\"\r\n" + 
				"                 hidden=\"false\">\r\n" + 
				"          <snap snap_id=\"0\"\r\n" + 
				"                anchor.horizontal=\"2\"\r\n" + 
				"                anchor.vertical=\"2\"/>\r\n" + 
				"        </marking>\r\n" + 
				"        <type id=\"ID1422669895\">\r\n" + 
				"          <posattr x=\"-1946.000000\"\r\n" + 
				"                   y=\"-162.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\">REQUIREMENT_LIST</text>\r\n" + 
				"        </type>\r\n" + 
				"        <initmark id=\"ID1434581305\">\r\n" + 
				"          <posattr x=\"-1900.000000\"\r\n" + 
				"                   y=\"-102.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\">ini</text>\r\n" + 
				"        </initmark>\r\n" + 
				"      </place>\r\n" + 
				"      <place id=\"ID1422680801\">\r\n" + 
				"        <posattr x=\"-1834.000000\"\r\n" + 
				"                 y=\"-42.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <text>02</text>\r\n" + 
				"        <ellipse w=\"60.000000\"\r\n" + 
				"                 h=\"40.000000\"/>\r\n" + 
				"        <token x=\"-10.000000\"\r\n" + 
				"               y=\"0.000000\"/>\r\n" + 
				"        <marking x=\"-28.000000\"\r\n" + 
				"                 y=\"81.000000\"\r\n" + 
				"                 hidden=\"false\">\r\n" + 
				"          <snap snap_id=\"0\"\r\n" + 
				"                anchor.horizontal=\"3\"\r\n" + 
				"                anchor.vertical=\"2\"/>\r\n" + 
				"        </marking>\r\n" + 
				"        <type id=\"ID1422680802\">\r\n" + 
				"          <posattr x=\"-1833.000000\"\r\n" + 
				"                   y=\"-86.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\">REQUIREMENT_LIST</text>\r\n" + 
				"        </type>\r\n" + 
				"        <initmark id=\"ID1423221178\">\r\n" + 
				"          <posattr x=\"-1777.000000\"\r\n" + 
				"                   y=\"-18.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </initmark>\r\n" + 
				"      </place>\r\n" + 
				"      <place id=\"ID1426322806\">\r\n" + 
				"        <posattr x=\"-1876.000000\"\r\n" + 
				"                 y=\"42.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <text>03S1</text>\r\n" + 
				"        <ellipse w=\"60.000000\"\r\n" + 
				"                 h=\"40.000000\"/>\r\n" + 
				"        <token x=\"-44.000000\"\r\n" + 
				"               y=\"24.000000\"/>\r\n" + 
				"        <marking x=\"28.000000\"\r\n" + 
				"                 y=\"72.000000\"\r\n" + 
				"                 hidden=\"false\">\r\n" + 
				"          <snap snap_id=\"0\"\r\n" + 
				"                anchor.horizontal=\"3\"\r\n" + 
				"                anchor.vertical=\"2\"/>\r\n" + 
				"        </marking>\r\n" + 
				"        <type id=\"ID1426322807\">\r\n" + 
				"          <posattr x=\"-1873.000000\"\r\n" + 
				"                   y=\"-3.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\">COMPONENT</text>\r\n" + 
				"        </type>\r\n" + 
				"        <initmark id=\"ID1434947938\">\r\n" + 
				"          <posattr x=\"-1918.000000\"\r\n" + 
				"                   y=\"42.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\">" + compTipo + "</text>\r\n" + 
				"        </initmark>\r\n" + 
				"      </place>\r\n" + 
				"      <place id=\"ID1434449385\">\r\n" + 
				"        <posattr x=\"-1960.000000\"\r\n" + 
				"                 y=\"42.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <text>05S1</text>\r\n" + 
				"        <ellipse w=\"60.000000\"\r\n" + 
				"                 h=\"40.000000\"/>\r\n" + 
				"        <token x=\"19.000000\"\r\n" + 
				"               y=\"23.000000\"/>\r\n" + 
				"        <marking x=\"56.000000\"\r\n" + 
				"                 y=\"25.000000\"\r\n" + 
				"                 hidden=\"false\">\r\n" + 
				"          <snap snap_id=\"0\"\r\n" + 
				"                anchor.horizontal=\"3\"\r\n" + 
				"                anchor.vertical=\"2\"/>\r\n" + 
				"        </marking>\r\n" + 
				"        <type id=\"ID1434449386\">\r\n" + 
				"          <posattr x=\"-1977.000000\"\r\n" + 
				"                   y=\"-3.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\">COMPONENT</text>\r\n" + 
				"        </type>\r\n" + 
				"        <initmark id=\"ID1436710552\">\r\n" + 
				"          <posattr x=\"-1903.000000\"\r\n" + 
				"                   y=\"65.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </initmark>\r\n" + 
				"      </place>\r\n" + 
				"     <trans id=\"ID1434576876\"\r\n" + 
				"             explicit=\"false\">\r\n" + 
				"        <posattr x=\"-1932.000000\"\r\n" + 
				"                 y=\"-42.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <text>T01</text>\r\n" + 
				"        <box w=\"60.000000\"\r\n" + 
				"             h=\"40.000000\"/>\r\n" + 
				"        <subst subpage=\"ID1434576890\"\r\n" + 
				"               portsock=\"(ID1434576917,ID1426322806)(ID1434576922,ID1422680801)(ID1434576927,ID1434449385)(ID1434576936,ID1422669894)\">\r\n" + 
				"          <subpageinfo id=\"ID1434576986\"\r\n" + 
				"                       name=\"Transition\">\r\n" + 
				"            <posattr x=\"-1932.000000\"\r\n" + 
				"                     y=\"-66.000000\"/>\r\n" + 
				"            <fillattr colour=\"White\"\r\n" + 
				"                      pattern=\"Solid\"\r\n" + 
				"                      filled=\"false\"/>\r\n" + 
				"            <lineattr colour=\"Black\"\r\n" + 
				"                      thick=\"0\"\r\n" + 
				"                      type=\"Solid\"/>\r\n" + 
				"            <textattr colour=\"Black\"\r\n" + 
				"                      bold=\"false\"/>\r\n" + 
				"          </subpageinfo>\r\n" + 
				"        </subst>\r\n" + 
				"        <binding x=\"7.200000\"\r\n" + 
				"                 y=\"-3.000000\"/>\r\n" + 
				"        <cond id=\"ID1434576877\">\r\n" + 
				"          <posattr x=\"-1971.000000\"\r\n" + 
				"                   y=\"-11.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </cond>\r\n" + 
				"        <time id=\"ID1434576878\">\r\n" + 
				"          <posattr x=\"-1887.500000\"\r\n" + 
				"                   y=\"-11.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </time>\r\n" + 
				"        <code id=\"ID1434576879\">\r\n" + 
				"          <posattr x=\"-1867.500000\"\r\n" + 
				"                   y=\"-94.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </code>\r\n" + 
				"        <priority id=\"ID1434576881\">\r\n" + 
				"          <posattr x=\"-2000.000000\"\r\n" + 
				"                   y=\"-73.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </priority>\r\n" + 
				"      </trans>\r\n" + 
				"      <trans id=\"ID1436734976\"\r\n" + 
				"             explicit=\"false\">\r\n" + 
				"        <posattr x=\"-1822.000000\"\r\n" + 
				"                 y=\"-126.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <text>Final</text>\r\n" + 
				"        <box w=\"60.000000\"\r\n" + 
				"             h=\"40.000000\"/>\r\n" + 
				"        <subst subpage=\"ID1436734986\"\r\n" + 
				"               portsock=\"(ID1436735020,ID"+this.ultimoPlace+")(ID1436735025,ID1422669894)\">\r\n" + 
				"          <subpageinfo id=\"ID1436735059\"\r\n" + 
				"                       name=\"Group 2\">\r\n" + 
				"            <posattr x=\"-1822.000000\"\r\n" + 
				"                     y=\"-150.000000\"/>\r\n" + 
				"            <fillattr colour=\"White\"\r\n" + 
				"                      pattern=\"Solid\"\r\n" + 
				"                      filled=\"false\"/>\r\n" + 
				"            <lineattr colour=\"Black\"\r\n" + 
				"                      thick=\"0\"\r\n" + 
				"                      type=\"Solid\"/>\r\n" + 
				"            <textattr colour=\"Black\"\r\n" + 
				"                      bold=\"false\"/>\r\n" + 
				"          </subpageinfo>\r\n" + 
				"        </subst>\r\n" + 
				"        <binding x=\"7.200000\"\r\n" + 
				"                 y=\"-3.000000\"/>\r\n" + 
				"        <cond id=\"ID1436734977\">\r\n" + 
				"          <posattr x=\"-1861.000000\"\r\n" + 
				"                   y=\"-95.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </cond>\r\n" + 
				"        <time id=\"ID1436734978\">\r\n" + 
				"          <posattr x=\"-1777.500000\"\r\n" + 
				"                   y=\"-95.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </time>\r\n" + 
				"        <code id=\"ID1436734979\">\r\n" + 
				"          <posattr x=\"-1757.500000\"\r\n" + 
				"                   y=\"-178.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </code>\r\n" + 
				"        <priority id=\"ID1436734981\">\r\n" + 
				"          <posattr x=\"-1890.000000\"\r\n" + 
				"                   y=\"-157.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </priority>\r\n" + 
				"      </trans>\r\n" + 
				"      <arc id=\"ID1434576882\"\r\n" + 
				"           orientation=\"BOTHDIR\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID1434576876\"/>\r\n" + 
				"        <placeend idref=\"ID1426322806\"/>\r\n" + 
				"        <annot id=\"ID1434576883\">\r\n" + 
				"          <posattr x=\"-1498.000000\"\r\n" + 
				"                   y=\"-33.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc>\r\n" + 
				"      <arc id=\"ID1434576884\"\r\n" + 
				"           orientation=\"TtoP\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID1434576876\"/>\r\n" + 
				"        <placeend idref=\"ID1422680801\"/>\r\n" + 
				"        <annot id=\"ID1434576885\">\r\n" + 
				"          <posattr x=\"-1214.000000\"\r\n" + 
				"                   y=\"-65.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc>\r\n" + 
				"      <arc id=\"ID1434576886\"\r\n" + 
				"           orientation=\"BOTHDIR\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID1434576876\"/>\r\n" + 
				"        <placeend idref=\"ID1434449385\"/>\r\n" + 
				"        <annot id=\"ID1434576887\">\r\n" + 
				"          <posattr x=\"-1502.000000\"\r\n" + 
				"                   y=\"96.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc>\r\n" + 
				"      <arc id=\"ID1434576888\"\r\n" + 
				"           orientation=\"PtoT\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID1434576876\"/>\r\n" + 
				"        <placeend idref=\"ID1422669894\"/>\r\n" + 
				"        <annot id=\"ID1434576889\">\r\n" + 
				"          <posattr x=\"-1516.000000\"\r\n" + 
				"                   y=\"-318.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc>\r\n" + 
				"      <!--place 02 para transicao 2-->\r\n" + 
				"	  <arc id=\"ID1434692874\" \r\n" + 
				"           orientation=\"PtoT\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID1436734976\"/>\r\n" + 
				"        <placeend idref=\"ID"+this.ultimoPlace+"\"/>\r\n" + 
				"        <annot id=\"ID1434692875\">\r\n" + 
				"          <posattr x=\"-1608.000000\"\r\n" + 
				"                   y=\"-149.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc>\r\n" + 
				 //this.direcaoArco(comp_atual) +
				"	  <!--transicao final para place 01-->\r\n" + 
				"      <arc id=\"ID1436734984\" \r\n" + 
				"           orientation=\"TtoP\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID1436734976\"/>\r\n" + 
				"        <placeend idref=\"ID1422669894\"/>\r\n" + 
				"        <annot id=\"ID1436734985\">\r\n" + 
				"          <posattr x=\"-1820.000000\"\r\n" + 
				"                   y=\"-205.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc>" ;
				/*"     <constraints/>\r\n" + 
				"    </page>"; */
		
		
		return mainpage;
	}
	
	public String novoComponente(Componente comp_atual) {
		
		String compTipo = comp_atual.getTipoComp();
		System.out.println(compTipo);
		if(compTipo=="UPS_5kVA"){
			compTipo = "UPS";
		}
		if(compTipo=="UPS_250kVA"){
			compTipo = "UPS";
		}
		if(compTipo=="SDTransformer"){
			compTipo = "SDT";
		}
		if(compTipo=="SubPanel"){
			compTipo = "SB";
		}
		if(compTipo=="PowerStrip"){
			compTipo = "PS";
		}
		
		String lugar = "<place id=\"ID" + ++idLugar + "\">\r\n" + 
				"        <posattr x=\"-1738.000000\"\r\n" + 
				"                 y=\"-126.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <text>03</text>\r\n" + 
				"        <ellipse w=\"60.000000\"\r\n" + 
				"                 h=\"40.000000\"/>\r\n" + 
				"        <token x=\"-10.000000\"\r\n" + 
				"               y=\"0.000000\"/>\r\n" + 
				"        <marking x=\"79.000000\"\r\n" + 
				"                 y=\"-40.000000\"\r\n" + 
				"                 hidden=\"false\">\r\n" + 
				"          <snap snap_id=\"0\"\r\n" + 
				"                anchor.horizontal=\"3\"\r\n" + 
				"                anchor.vertical=\"1\"/>\r\n" + 
				"        </marking>\r\n" + 
				"        <type id=\"ID" + ++idType + "\">\r\n" + 
				"          <posattr x=\"-1736.000000\"\r\n" + 
				"                   y=\"-168.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\">REQUIREMENT_LIST</text>\r\n" + 
				"        </type>\r\n" + 
				"        <initmark id=\"ID" + ++idInitmark + "\">\r\n" + 
				"          <posattr x=\"-1681.000000\"\r\n" + 
				"                   y=\"-102.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </initmark>\r\n" + 
				"      </place>\r\n" + 
				"      ";
		
		String lugar03S = "<place id=\"ID" + ++idLugar03S + "\">\r\n" + 
				"        <posattr x=\"-1691.000000\"\r\n" + 
				"                 y=\"42.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <text>03S</text>\r\n" + 
				"        <ellipse w=\"60.000000\"\r\n" + 
				"                 h=\"40.000000\"/>\r\n" + 
				"        <token x=\"-44.000000\"\r\n" + 
				"               y=\"24.000000\"/>\r\n" + 
				"        <marking x=\"32.000000\"\r\n" + 
				"                 y=\"55.000000\"\r\n" + 
				"                 hidden=\"false\">\r\n" + 
				"          <snap snap_id=\"0\"\r\n" + 
				"                anchor.horizontal=\"1\"\r\n" + 
				"                anchor.vertical=\"2\"/>\r\n" + 
				"        </marking>\r\n" + 
				"        <type id=\"ID" + ++idType03S + "\">\r\n" + 
				"          <posattr x=\"-1686.000000\"\r\n" + 
				"                   y=\"-1.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\">COMPONENT</text>\r\n" + 
				"        </type>\r\n" + 
				"        <initmark id=\"ID" + ++idInitmark03S + "\">\r\n" + 
				"          <posattr x=\"-1733.000000\"\r\n" + 
				"                   y=\"42.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\">" + compTipo + "</text>\r\n" + 
				"        </initmark>\r\n" + 
				"      </place>\r\n" + 
				"      ";

		String lugar05S = "<place id=\"ID" + ++idLugar05S + "\">\r\n" + 
				"        <posattr x=\"-1778.000000\"\r\n" + 
				"                 y=\"42.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <text>05S</text>\r\n" + 
				"        <ellipse w=\"60.000000\"\r\n" + 
				"                 h=\"40.000000\"/>\r\n" + 
				"        <token x=\"12.000000\"\r\n" + 
				"               y=\"26.000000\"/>\r\n" + 
				"        <marking x=\"13.000000\"\r\n" + 
				"                 y=\"13.000000\"\r\n" + 
				"                 hidden=\"false\">\r\n" + 
				"          <snap snap_id=\"0\"\r\n" + 
				"                anchor.horizontal=\"3\"\r\n" + 
				"                anchor.vertical=\"2\"/>\r\n" + 
				"        </marking>\r\n" + 
				"        <type id=\"ID" + ++idType05S + "\">\r\n" + 
				"          <posattr x=\"-1783.000000\"\r\n" + 
				"                   y=\"-2.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\">COMPONENT</text>\r\n" + 
				"        </type>\r\n" + 
				"        <initmark id=\"ID" + ++idInitmark05S + "\">\r\n" + 
				"          <posattr x=\"-1721.000000\"\r\n" + 
				"                   y=\"65.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </initmark>\r\n" + 
				"      </place>\r\n" + 
				"      ";
		
		int idLugarAnterior = idLugar; 
		--idLugarAnterior;
		
		String transicao = "<trans id=\"ID" + ++idTransicao + "\"\r\n" + 
				"             explicit=\"false\">\r\n" + 
				"        <posattr x=\"-1738.000000\"\r\n" + 
				"                 y=\"-42.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <text>T0"+(this.instanciasIDs.size()+2)+"</text>\r\n" + 
				"        <box w=\"60.000000\"\r\n" + 
				"             h=\"40.000000\"/>\r\n" + 
				"        <subst subpage=\"ID1434576890\"\r\n" + 
				"               portsock=\"(ID1434576927,ID" + idLugar05S + ")(ID1434576917,ID" + idLugar03S + ")(ID1434576936,ID" + this.ultimoPlace + ")(ID1434576922,ID" + idLugar + ")\">\r\n" + 
				"          <subpageinfo id=\"ID"+ ++idSubpageInfo+"\"\r\n" + 
				"                       name=\"Transition\">\r\n" + 
				"            <posattr x=\"-1738.000000\"\r\n" + 
				"                     y=\"-66.000000\"/>\r\n" + 
				"            <fillattr colour=\"White\"\r\n" + 
				"                      pattern=\"Solid\"\r\n" + 
				"                      filled=\"false\"/>\r\n" + 
				"            <lineattr colour=\"Black\"\r\n" + 
				"                      thick=\"0\"\r\n" + 
				"                      type=\"Solid\"/>\r\n" + 
				"            <textattr colour=\"Black\"\r\n" + 
				"                      bold=\"false\"/>\r\n" + 
				"          </subpageinfo>\r\n" + 
				"        </subst>\r\n" + 
				"        <binding x=\"7.200000\"\r\n" + 
				"                 y=\"-3.000000\"/>\r\n" + 
				"        <cond id=\"ID"+ ++idCond+"\">\r\n" + 
				"          <posattr x=\"-1777.000000\"\r\n" + 
				"                   y=\"-11.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </cond>\r\n" + 
				"        <time id=\"ID"+ ++idTime +"\">\r\n" + 
				"          <posattr x=\"-1693.500000\"\r\n" + 
				"                   y=\"-11.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </time>\r\n" + 
				"        <code id=\"ID"+ ++idCode +"\">\r\n" + 
				"          <posattr x=\"-1673.500000\"\r\n" + 
				"                   y=\"-94.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </code>\r\n" + 
				"        <priority id=\"ID"+ ++idPriority+"\">\r\n" + 
				"          <posattr x=\"-1806.000000\"\r\n" + 
				"                   y=\"-73.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </priority>\r\n" + 
				"      </trans>\r\n" + 
				"      "; 
		
		
		String arco1 = "      <arc id=\"ID" + ++idArco1 + "\"\r\n" + 
				"           orientation=\"BOTHDIR\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID" + idTransicao + "\"/>\r\n" + 
				"        <placeend idref=\"ID" + idLugar05S + "\"/>\r\n" + 
				"        <annot id=\"ID " + ++idAnnot1 + " \">\r\n" + 
				"          <posattr x=\"-1503.000000\"\r\n" + 
				"                   y=\"96.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc>";
				
		
		String arco2 = "<arc id=\"ID" + ++idArco2 + "\"\r\n" + 
				"           orientation=\"BOTHDIR\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID" + idTransicao + "\"/>\r\n" + 
				"        <placeend idref=\"ID" + idLugar03S + "\"/>\r\n" + 
				"        <annot id=\"ID" + ++idAnnot2 + "\">\r\n" + 
				"          <posattr x=\"-1498.000000\"\r\n" + 
				"                   y=\"-40.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc> \r\n" + 
				"      ";
		System.out.println("salvou msm");
		String arco3 = "<arc id=\"ID" + ++idArco3 + "\" \r\n" + 
				"           orientation=\"TtoP\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID" + idTransicao + "\"/>\r\n" + 
				"        <placeend idref=\"ID" + idLugar + "\"/>\r\n" + 
				"        <annot id=\"ID" + ++idAnnot3 + "\">\r\n" + 
				"          <posattr x=\"-896.000000\"\r\n" + 
				"                   y=\"-135.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc>\r\n" + 
				"	  ";
		
		String arco4 = "<arc id=\"ID" + idArco4 + "\" \r\n" + 
				"           orientation=\"PtoT\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID" + idTransicao + "\"/>\r\n" + 
				"        <placeend idref=\"ID" + idLugar + "\"/>\r\n" + 
				"        <annot id=\"ID" + idAnnot4 + "\">\r\n" + 
				"          <posattr x=\"-1683.000000\"\r\n" + 
				"                   y=\"-142.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc>\r\n" + 
				"	  ";
		
		String arco5 = "<arc id=\"ID" + ++idArco5 + "\" \r\n" + 
				"           orientation=\"PtoT\"\r\n" + 
				"           order=\"1\">\r\n" + 
				"        <posattr x=\"0.000000\"\r\n" + 
				"                 y=\"0.000000\"/>\r\n" + 
				"        <fillattr colour=\"White\"\r\n" + 
				"                  pattern=\"\"\r\n" + 
				"                  filled=\"false\"/>\r\n" + 
				"        <lineattr colour=\"Black\"\r\n" + 
				"                  thick=\"1\"\r\n" + 
				"                  type=\"Solid\"/>\r\n" + 
				"        <textattr colour=\"Black\"\r\n" + 
				"                  bold=\"false\"/>\r\n" + 
				"        <arrowattr headsize=\"1.200000\"\r\n" + 
				"                   currentcyckle=\"2\"/>\r\n" + 
				"        <transend idref=\"ID" + idTransicao + "\"/>\r\n" + 
				"        <placeend idref=\"ID" + this.ultimoPlace + "\"/>\r\n" + 
				"        <annot id=\"ID" + ++idAnnot5 + "\">\r\n" + 
				"          <posattr x=\"-1683.000000\"\r\n" + 
				"                   y=\"-142.000000\"/>\r\n" + 
				"          <fillattr colour=\"White\"\r\n" + 
				"                    pattern=\"Solid\"\r\n" + 
				"                    filled=\"false\"/>\r\n" + 
				"          <lineattr colour=\"Black\"\r\n" + 
				"                    thick=\"0\"\r\n" + 
				"                    type=\"Solid\"/>\r\n" + 
				"          <textattr colour=\"Black\"\r\n" + 
				"                    bold=\"false\"/>\r\n" + 
				"          <text tool=\"CPN Tools\"\r\n" + 
				"                version=\"4.0.1\"/>\r\n" + 
				"        </annot>\r\n" + 
				"      </arc>\r\n" + 
				"	  ";
		
		this.instanciasIDs.add(idTransicao);
		this.ultimoPlace = idLugar;
		
		return lugar + lugar03S + lugar05S + transicao + arco1 + arco2 + arco3 + arco5; 
		
	}
	
	String arco1componente = "<arc id=\"ID1434692874\" \r\n" + 
			"           orientation=\"PtoT\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1436734976\"/>\r\n" + 
			"        <placeend idref=\"ID1422680801\"/>\r\n" + 
			"        <annot id=\"ID1434692875\">\r\n" + 
			"          <posattr x=\"-1608.000000\"\r\n" + 
			"                   y=\"-149.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>";
	String arco2componente = "<arc id=\"ID1434692874\" \r\n" + 
			"           orientation=\"PtoT\"\r\n" + 
			"           order=\"1\">\r\n" + 
			"        <posattr x=\"0.000000\"\r\n" + 
			"                 y=\"0.000000\"/>\r\n" + 
			"        <fillattr colour=\"White\"\r\n" + 
			"                  pattern=\"\"\r\n" + 
			"                  filled=\"false\"/>\r\n" + 
			"        <lineattr colour=\"Black\"\r\n" + 
			"                  thick=\"1\"\r\n" + 
			"                  type=\"Solid\"/>\r\n" + 
			"        <textattr colour=\"Black\"\r\n" + 
			"                  bold=\"false\"/>\r\n" + 
			"        <arrowattr headsize=\"1.200000\"\r\n" + 
			"                   currentcyckle=\"2\"/>\r\n" + 
			"        <transend idref=\"ID1434692864\"/>\r\n" + 
			"        <placeend idref=\"ID1422680801\"/>\r\n" + 
			"        <annot id=\"ID1434692875\">\r\n" + 
			"          <posattr x=\"-1608.000000\"\r\n" + 
			"                   y=\"-149.000000\"/>\r\n" + 
			"          <fillattr colour=\"White\"\r\n" + 
			"                    pattern=\"Solid\"\r\n" + 
			"                    filled=\"false\"/>\r\n" + 
			"          <lineattr colour=\"Black\"\r\n" + 
			"                    thick=\"0\"\r\n" + 
			"                    type=\"Solid\"/>\r\n" + 
			"          <textattr colour=\"Black\"\r\n" + 
			"                    bold=\"false\"/>\r\n" + 
			"          <text tool=\"CPN Tools\"\r\n" + 
			"                version=\"4.0.1\"/>\r\n" + 
			"        </annot>\r\n" + 
			"      </arc>";
	
	public String direcaoArco(Componente comp_atual) {	
		System.out.println(qtd_comp);
		if(this.qtd_comp == 1 ){
			return arco1componente;
		} 
		else {
			return arco2componente;
		}
		/*else {
			return arco1componente;
		}*/	
	}
	
	String Script_meio; 
	
    private void varrer(String anterior,  mxCell vert_atual){
        String id_atual = vert_atual.getId();
        String compTipo = ((Componente) vert_atual.getValue()).getTipoComp();
        
        
        String atual = compTipo + id_atual;
        Script_meio += "	arc " + anterior + " -> " + atual + ";\n";
        
        //String criaComponente = novoComponente(vert_atual);
        
        int cont = 0;
        int max = vert_atual.getEdgeCount();
        boolean veri = true;
        //System.out.println("max " + max);
        while (cont < max){
            mxCell edge = (mxCell)vert_atual.getEdgeAt(cont);
            mxCell target = (mxCell)edge.getTarget();
            String source = edge.getSource().getId();
            if(source == id_atual){
                varrer(atual, target);
                veri = false;
            }
            cont ++;
        }
        if (veri == true){
            Script_meio += "	arc " + atual + " -> TargetPoint1;\n";
        }
    }
	
	public String gerarInstancia() {
		String inst = "";
		System.out.println("aqui " + this.qtd_comp);
		if(this.qtd_comp > 1) {
			int i;
			for(i=0;i<this.instanciasIDs.size(); i++) {
				inst += "<instance id=\"ID"+ ++idInstancia1 +"\"\r\n" + 
						"                  trans=\"ID"+this.instanciasIDs.get(i)+"\">\r\n" + 
						"          <instance id=\"ID" + ++idInstancia2 + "\"\r\n" + 
						"                    trans=\"ID1434576907\"/>\r\n" + 
						"        </instance>";
			}			
		}
		
		return inst; 
			
	}
	
	int qtd, qtd_comp;
    
	public String gerarScript(Object[] vertices ){
        Script_meio = "\n";
        
        mxCell cell = (mxCell) vertices[0];
        this.qtd_comp = vertices.length; 
        
        //System.out.println(saida2);
        String saida = "";
        this.qtd_comp = vertices.length; 
        System.out.println(qtd_comp+ "aaaaaaaaaa");
        
        //System.out.println(vertices.length);
        
        
        if(qtd_comp == 1) {
        	String saida2 = this.gerarMainpage((Componente) cell.getValue());
        	this.instancia = "    <instances>\r\n" + 
    				"      <instance id=\"ID2149\"\r\n" + 
    				"                page=\"ID6\">\r\n" + 
    				this.gerarInstancia() + 
    				"        <instance id=\"ID1434576987\"\r\n" + 
    				"                  trans=\"ID1434576876\">\r\n" + //t01
    				"          <instance id=\"ID1434575022\"\r\n" + 
    				"                    trans=\"ID1434576907\"/>\r\n" + // tstatus (fica dentro de subpagestatus)
    				"        </instance>\r\n" + 
    				"        <instance id=\"ID1436735060\"\r\n" + 
    				"                  trans=\"ID1436734976\"/>\r\n" + // tfinal
    				"      </instance>\r\n" + 
    				"    </instances>";
        	return inicio + saida2 + subpageTrans + subpageSts + subpageFinal + instancia + fim;
        }
        else {
        	//for (Object vertObject:vertices){
        	int i;
        	for(i = 1;i<qtd_comp; i++) {
        		System.out.println("componente");
        		System.out.println(i);
            mxCell vertice = (mxCell) vertices[i];
            //String id = vertice.getId();
            
            //this.qtd_comp++;
            
            //String bloco2 = this.gerarMainpage((Componente)vertice.getValue());
            String bloco = this.novoComponente((Componente)vertice.getValue());
            
            int cont = 0;
            boolean veri = true;
             
            while (cont < vertice.getEdgeCount()){
                mxCell edge = (mxCell) vertice.getEdgeAt(cont);
                String target = edge.getTarget().getId();
                
                /*
                if (target == id){
                    veri = false;
                }*/
                cont++;
            }
            saida += "	" + bloco;
            //saida2 += " " + bloco2; 
            
            if (veri == true){
                varrer(" ", vertice);
            }
            
        	}
        	
        	this.instancia = "    <instances>\r\n" + 
    				"      <instance id=\"ID2149\"\r\n" + 
    				"                page=\"ID6\">\r\n" + 
    				this.gerarInstancia() + 
    				"        <instance id=\"ID1434576987\"\r\n" + 
    				"                  trans=\"ID1434576876\">\r\n" + //t01
    				"          <instance id=\"ID1434575022\"\r\n" + 
    				"                    trans=\"ID1434576907\"/>\r\n" + // tstatus (fica dentro de subpagestatus)
    				"        </instance>\r\n" + 
    				"        <instance id=\"ID1436735060\"\r\n" + 
    				"                  trans=\"ID1436734976\"/>\r\n" + // tfinal
    				"      </instance>\r\n" + 
    				"    </instances>";
        
        	String saida2 = this.gerarMainpage((Componente) cell.getValue());
        	return inicio + saida2 + saida + subpageTrans + subpageSts + subpageFinal + instancia + fim;
        }
        
        
        //return saida;		
    }
	
    public void imprimirScript(Object[] vertices){
      String texto = this.gerarScript(vertices);
      JanelaScripts js = new JanelaScripts(null, true);
      js.taScripts.setText(texto);
      js.setVisible(true);
    }






}

