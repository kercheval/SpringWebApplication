package org.kercheval.jsonp;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

public class MappingJacksonJsonpView
    extends MappingJacksonJsonView
{
    @SuppressWarnings("hiding")
    public static final String DEFAULT_CONTENT_TYPE = "application/javascript";

    Logger log = Logger.getLogger(this.getClass().getCanonicalName());

    @Override
    public String getContentType()
    {
        log.info("MappingJacksonJsonpView.getContentType() called");

        return DEFAULT_CONTENT_TYPE;
    }

    //
    // Prepares the view given the specified model, merging it with static
    // attributes and a RequestContext attribute, if necessary.
    // Delegates to renderMergedOutputModel for the actual rendering.
    //
    @Override
    public void render(final Map<String, ?> model, final HttpServletRequest request,
        final HttpServletResponse response)
        throws Exception
    {
        log.info("MappingJacksonJsonpView.render() called");

        if ("GET".equals(request.getMethod().toUpperCase()))
        {
            @SuppressWarnings("unchecked")
            final Map<String, String[]> params = request.getParameterMap();

            if (params.containsKey("callback"))
            {
                response.getOutputStream().write(
                    new String(params.get("callback")[0] + "(").getBytes());
                super.render(model, request, response);
                response.getOutputStream().write(new String(");").getBytes());
                response.setContentType("application/javascript");
            }
            else
            {
                super.render(model, request, response);
            }
        }
        else
        {
            super.render(model, request, response);
        }
    }
}
