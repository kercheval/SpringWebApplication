package org.kercheval.jsp;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.apache.log4j.Logger;
import org.kercheval.statistics.MethodTrace;

public class SampleTag
    extends BodyTagSupport
{
    Logger log = Logger.getLogger(this.getClass().getCanonicalName());

    private String sampleAttribute;
    public String getSampleAttribute() {
        return sampleAttribute;
    }
    public void setSampleAttribute(final String attribute)
    {
        sampleAttribute = attribute;
    }

    @Override
    public int doStartTag()
        throws JspException
    {
        try
        {
            pageContext.getOut().print("SampleTag received attribute: " + getSampleAttribute());
        }
        catch (final IOException e)
        {
            log.error(MethodTrace.getMethodName(1) + " was unable to output tag contents", e);
        }

        return BodyTag.EVAL_BODY_BUFFERED;
    }

}
