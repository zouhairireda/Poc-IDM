/**
 * generated by Xtext
 */
package org.poc.idm.xtext.wdl.generator;

import Wdl.Page;
import Wdl.Website;
import com.google.common.collect.Iterables;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class WdlGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Website> _filter = Iterables.<Website>filter(_iterable, Website.class);
    final Website websiteObject = IterableExtensions.<Website>head(_filter);
    GregorianCalendar _gregorianCalendar = new GregorianCalendar();
    int _get = _gregorianCalendar.get(Calendar.YEAR);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("&copy; ");
    String _plus = (Integer.valueOf(_get) + _builder.toString());
    String _copyright = websiteObject.getCopyright();
    final String fullCopyright = (_plus + _copyright);
    final boolean isMobile = websiteObject.isIsMobileFriendly();
    if ((!isMobile)) {
      CharSequence _css = this.css();
      fsa.generateFile("screen.css", _css);
      TreeIterator<EObject> _allContents_1 = resource.getAllContents();
      Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
      Iterable<Page> _filter_1 = Iterables.<Page>filter(_iterable_1, Page.class);
      for (final Page p : _filter_1) {
        String _name = p.getName();
        String _plus_1 = (_name + ".html");
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<html>");
        _builder_1.newLine();
        _builder_1.append("<head>");
        _builder_1.newLine();
        _builder_1.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"screen.css\">");
        _builder_1.newLine();
        _builder_1.append("<title>");
        String _title = p.getTitle();
        String _plus_2 = (_builder_1.toString() + _title);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("</title></head>");
        _builder_2.newLine();
        _builder_2.append("                          ");
        _builder_2.append("<body>");
        String _plus_3 = (_plus_2 + _builder_2);
        CharSequence _menu = this.getMenu(p);
        String _plus_4 = (_plus_3 + _menu);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("<p>");
        String _plus_5 = (_plus_4 + _builder_3);
        CharSequence _lorem = this.lorem();
        String _plus_6 = (_plus_5 + _lorem);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("</p>");
        _builder_4.newLine();
        _builder_4.append("                          ");
        _builder_4.append("<hr/>");
        _builder_4.newLine();
        _builder_4.append("                          ");
        _builder_4.append("<footer>");
        String _plus_7 = (_plus_6 + _builder_4);
        String _plus_8 = (_plus_7 + fullCopyright);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("</footer>");
        _builder_5.newLine();
        _builder_5.append("                          ");
        _builder_5.append("</body>");
        _builder_5.newLine();
        _builder_5.append("                          ");
        _builder_5.append("</html>");
        String _plus_9 = (_plus_8 + _builder_5);
        fsa.generateFile(_plus_1, _plus_9);
      }
    } else {
    }
  }
  
  public CharSequence getMenu(final Page p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul id=\"menu_horizontal\">");
    _builder.newLine();
    {
      EList<Page> _targets = p.getTargets();
      for(final Page cible : _targets) {
        _builder.append("\t\t");
        _builder.append("<li><a href=\"./");
        String _name = cible.getName();
        _builder.append(_name, "\t\t");
        _builder.append(".html\"> ");
        String _title = cible.getTitle();
        _builder.append(_title, "\t\t");
        _builder.append(" </a></li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t    ");
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence css() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* Je sélectionne les <li> du menu horizontal */");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("ul#menu_horizontal li {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("display : inline;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("padding : 0 0.5em; /* Pour espacer les boutons entre eux */");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("a:hover { color:red; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("ul#menu_horizontal {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("list-style-type : none; /* Car sinon les puces se placent n\'importe où */");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence lorem() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
    return _builder;
  }
}
