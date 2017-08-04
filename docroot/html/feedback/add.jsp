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
	  <aui:fieldset cssClass="span3">
            <aui:field-wrapper name="type" required="true"> 
			<aui:input inlineLabel="right" name="type" type="radio" value="1" label="fb-sys-error" checked="true" /> 
			<aui:input inlineLabel="right" name="type" type="radio" value="2" label="fb-func-sug" /> 
			</aui:field-wrapper>
        </aui:fieldset>
	   <aui:fieldset cssClass="span3">
	        <aui:input label="fb-content" name="content">
	          <aui:validator name="required"/>
	         </aui:input>
        </aui:fieldset>
	    <aui:fieldset cssClass="span4">
            <aui:input label="" name="fbFile" type="file" accept="image/*">
	        </aui:input>
        </aui:fieldset>
       
        <aui:button-row cssClass="span10">
           <aui:button type="submit"/>
        </aui:button-row>
	</div>
</aui:form>
