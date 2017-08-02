<%@ include file="/html/init.jsp" %>
<%@page import="com.j2eecn.fb.service.FeedBackLocalServiceUtil"%>

<portlet:renderURL var="backRenderURL">
	<portlet:param name="mvcPath" value="/html/feedback/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="addFB" var="addFBActionURL">
    <portlet:param name="redirectURL" value="${backRenderURL }"/>
</portlet:actionURL>


<aui:form name="fbAddForm" enctype="multipart/form-data" method="post" action="${addFBActionURL }">
	<div class="row-fluid">
	   <aui:fieldset cssClass="span5">
	        <aui:input label="fb-desc" name="content">
	          <aui:validator name="required"/>
	         </aui:input>
        </aui:fieldset>
	    <aui:fieldset cssClass="span5">
            <aui:input label="" name="fbFile" type="file">
	        </aui:input>
        </aui:fieldset>
       
        <aui:button-row cssClass="span10">
           <aui:button type="submit"/>
        </aui:button-row>
	</div>
</aui:form>
