package com.java2c.transpiler.c.gccAttributes;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.Writer;

public final class GccAttribute<N extends Enum<N> & AttributeName> implements Writable
{
	@NotNull private final N name;
	@NotNull private final GccAttributeParameter[] gccAttributeParameters;

	@SuppressWarnings("AssignmentToCollectionOrArrayFieldFromParameter")
	public GccAttribute(@NotNull final N name, @NotNull GccAttributeParameter... gccAttributeParameters)
	{
		this.name = name;
		this.gccAttributeParameters = gccAttributeParameters;
	}

	@Override
	public void write(@NotNull final Writer writer) throws IOException
	{
		writer.write(name.name());
		if (gccAttributeParameters.length != 0)
		{
			writer.write(" (");
			boolean afterFirst = false;
			for (final GccAttributeParameter gccAttributeParameter : gccAttributeParameters)
			{
				if (afterFirst)
				{
					writer.write(", ");
				}
				else
				{
					afterFirst = true;
				}
				gccAttributeParameter.write(writer);
			}
			writer.write(')');
		}
	}
}
