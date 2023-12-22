package net.exoad.annotations;
import java.lang.annotation.*;
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ServiceClass
{
	boolean requiresArming();
}