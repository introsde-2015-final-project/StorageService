
package introsde.assignment.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://soap.assignment.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @return
     *     returns java.util.List<introsde.assignment.soap.Person>
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://soap.assignment.introsde/", className = "introsde.assignment.soap.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://soap.assignment.introsde/", className = "introsde.assignment.soap.ReadPersonListResponse")
    @Action(input = "http://soap.assignment.introsde/People/readPersonListRequest", output = "http://soap.assignment.introsde/People/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param personId
     * @return
     *     returns introsde.assignment.soap.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://soap.assignment.introsde/", className = "introsde.assignment.soap.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://soap.assignment.introsde/", className = "introsde.assignment.soap.ReadPersonResponse")
    @Action(input = "http://soap.assignment.introsde/People/readPersonRequest", output = "http://soap.assignment.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param personId
     * @param lifeStatus
     * @return
     *     returns introsde.assignment.soap.LifeStatus
     * @throws ParseException_Exception
     */
    @WebMethod
    @WebResult(name = "newValueMeasurement", targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://soap.assignment.introsde/", className = "introsde.assignment.soap.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://soap.assignment.introsde/", className = "introsde.assignment.soap.SavePersonMeasureResponse")
    @Action(input = "http://soap.assignment.introsde/People/savePersonMeasureRequest", output = "http://soap.assignment.introsde/People/savePersonMeasureResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://soap.assignment.introsde/People/savePersonMeasure/Fault/ParseException")
    })
    public LifeStatus savePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "lifeStatus", targetNamespace = "")
        LifeStatus lifeStatus)
        throws ParseException_Exception
    ;

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<introsde.assignment.soap.Goal>
     */
    @WebMethod
    @WebResult(name = "Goal", targetNamespace = "")
    @RequestWrapper(localName = "readPersonGoals", targetNamespace = "http://soap.assignment.introsde/", className = "introsde.assignment.soap.ReadPersonGoals")
    @ResponseWrapper(localName = "readPersonGoalsResponse", targetNamespace = "http://soap.assignment.introsde/", className = "introsde.assignment.soap.ReadPersonGoalsResponse")
    @Action(input = "http://soap.assignment.introsde/People/readPersonGoalsRequest", output = "http://soap.assignment.introsde/People/readPersonGoalsResponse")
    public List<Goal> readPersonGoals(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param personId
     * @param singleGoal
     * @return
     *     returns introsde.assignment.soap.Goal
     * @throws ParseException_Exception
     */
    @WebMethod
    @WebResult(name = "updateGoal", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonGoal", targetNamespace = "http://soap.assignment.introsde/", className = "introsde.assignment.soap.UpdatePersonGoal")
    @ResponseWrapper(localName = "updatePersonGoalResponse", targetNamespace = "http://soap.assignment.introsde/", className = "introsde.assignment.soap.UpdatePersonGoalResponse")
    @Action(input = "http://soap.assignment.introsde/People/updatePersonGoalRequest", output = "http://soap.assignment.introsde/People/updatePersonGoalResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://soap.assignment.introsde/People/updatePersonGoal/Fault/ParseException")
    })
    public Goal updatePersonGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "singleGoal", targetNamespace = "")
        Goal singleGoal)
        throws ParseException_Exception
    ;

}
