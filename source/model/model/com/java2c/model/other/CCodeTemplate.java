/*
 * This file is part of java2c. It is subject to the licence terms in the COPYRIGHT file found in the top-level directory of this distribution and at https://raw.githubusercontent.com/raphaelcohn/java2c/master/COPYRIGHT. No part of compilerUser, including this file, may be copied, modified, propagated, or distributed except according to the terms contained in the COPYRIGHT file.
 * Copyright © 2014-2015 The developers of java2c. See the COPYRIGHT file in the top-level directory of this distribution and at https://raw.githubusercontent.com/raphaelcohn/java2c/master/COPYRIGHT.
 */

package com.java2c.model.other;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({CONSTRUCTOR, METHOD, FIELD})
@Retention(RUNTIME)
public @interface CCodeTemplate
{
	@NotNull String[] value();

	@NotNull String[] includes() default {};

	@NotNull String Scalar = "(@value@)";
}
