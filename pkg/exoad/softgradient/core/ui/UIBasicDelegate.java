package pkg.exoad.softgradient.core.ui;

import javax.swing.JComponent;

import pkg.exoad.softgradient.core.services.mixins.SelfReportingMixin;

public interface UIBasicDelegate<T extends JComponent>
                                extends
                                SelfReportingMixin
{
      public T asComponent();

      public default void refresh()
      {
            asComponent()
                  .repaint();
      }

      public default void hardRefresh()
      {
            asComponent()
                  .revalidate();
      }
}