<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="sidebar-nav">
  <div class="nav-canvas">
    <div class="nav-sm nav nav-stacked">
    </div>
    <ul class="nav nav-pills nav-stacked main-menu">
      <li class="nav-header">Main</li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/index.jsp"><i
              class="glyphicon glyphicon-home"></i><span> Dashboard</span></a>
      </li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/ui.jsp"><i
              class="glyphicon glyphicon-eye-open"></i><span> UI Features</span></a>
      </li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/form.jsp"><i
              class="glyphicon glyphicon-edit"></i><span> Forms</span></a></li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/chart.jsp"><i
              class="glyphicon glyphicon-list-alt"></i><span> Charts</span></a>
      </li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/typography.jsp"><i
              class="glyphicon glyphicon-font"></i><span> Typography</span></a>
      </li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/gallery.jsp"><i
              class="glyphicon glyphicon-picture"></i><span> Gallery</span></a>
      </li>
      <li class="nav-header hidden-md">Sample Section</li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/table.jsp"><i
              class="glyphicon glyphicon-align-justify"></i><span> Tables</span></a></li>
      <li class="accordion">
        <a href="#"><i class="glyphicon glyphicon-plus"></i><span> Accordion Menu</span></a>
        <ul class="nav nav-pills nav-stacked">
          <li><a href="#">Child Menu 1</a></li>
          <li><a href="#">Child Menu 2</a></li>
        </ul>
      </li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/calendar.jsp"><i
              class="glyphicon glyphicon-calendar"></i><span> Calendar</span></a>
      </li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/grid.jsp"><i
              class="glyphicon glyphicon-th"></i><span> Grid</span></a></li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/tour.jsp"><i
              class="glyphicon glyphicon-globe"></i><span> Tour</span></a></li>
      <li><a class="ajax-link" href="${pageContext.request.contextPath}/background/icon.jsp"><i
              class="glyphicon glyphicon-star"></i><span> Icons</span></a></li>
      <li><a href="${pageContext.request.contextPath}/background/error.jsp"><i
              class="glyphicon glyphicon-ban-circle"></i><span> Error Page</span></a>
      </li>
      <li><a href="${pageContext.request.contextPath}/background/login.jsp"><i
              class="glyphicon glyphicon-lock"></i><span> Login Page</span></a>
      </li>
    </ul>
    <label id="for-is-ajax" for="is-ajax"><input id="is-ajax" type="checkbox"> Ajax on menu</label>
  </div>
</div>
