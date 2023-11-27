package pkg.exoad.softgradient.core.events;

import java.util.Arrays;

import pkg.exoad.softgradient.core.GradientColor;

public final record GradientEventPayload(GradientColor[] colors,float startX,float startY,float endX,float endY)
                                        implements
                                        EventPayload
{

      public static final GradientEventPayload EMPTY=new GradientEventPayload(
                  new GradientColor[0],
                  -1,
                  -1,
                  -1,
                  -1
      );

      @Override public boolean equals(Object obj)
      {
            if(this==obj)
                  return true;
            if(obj==null)
                  return false;
            if(getClass()!=obj.getClass())
                  return false;
            GradientEventPayload other=(GradientEventPayload)obj;
            if(colors==null)
            {
                  if(other.colors!=null)
                        return false;
            }
            else if(Arrays.equals(
                        colors,
                        other.colors)==false)
                  return false;
            if(Float.floatToIntBits(endX)!=Float.floatToIntBits(other.endX))
                  return false;
            if(Float.floatToIntBits(endY)!=Float.floatToIntBits(other.endY))
                  return false;
            if(Float.floatToIntBits(startX)!=Float.floatToIntBits(other.startX))
                  return false;
            if(Float.floatToIntBits(startY)!=Float.floatToIntBits(other.startY))
                  return false;
            return true;
      }

      @Override public int hashCode()
      {
            final int prime=31;
            int result=1;
            result=prime*result+((colors==null)
                        ? 0
                        : colors.hashCode());
            result=prime*result+Float.floatToIntBits(endX);
            result=prime*result+Float.floatToIntBits(endY);
            result=prime*result+Float.floatToIntBits(startX);
            result=prime*result+Float.floatToIntBits(startY);
            return result;
      }

      @Override public String toString()
      {
            return "GradientEventPayload [colors="+colors+", startX="+startX+", startY="+startY+", endX="+endX+", endY="
                        +endY+"]";
      }
}
