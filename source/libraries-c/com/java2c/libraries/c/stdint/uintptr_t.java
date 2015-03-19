package com.java2c.libraries.c.stdint;

import com.java2c.model.scalars.AbstractScalar;
import com.java2c.model.other.CCodeTemplate;
import com.java2c.model.scalars.Scalar;
import com.java2c.model.scalars.BooleanAlgebra;
import com.java2c.model.scalars.Comparison;
import com.java2c.model.scalars.Equality;
import com.java2c.model.scalars.Mathematics;
import org.jetbrains.annotations.NotNull;

import static com.java2c.model.other.CCodeTemplate.Scalar;
import static com.java2c.libraries.c.stdint.stdint.stdint;
import static com.java2c.libraries.c.stdint.uint64_t.UINT64_MAX;

@SuppressWarnings("ClassNamingConvention")
@Scalar(value = "uintptr_t", signed = false, includes = stdint)
public final class uintptr_t extends AbstractScalar<uintptr_t> implements Equality<uintptr_t>, Comparison<uintptr_t>, Mathematics<uintptr_t>, BooleanAlgebra<uintptr_t>
{
	// Only on 64-bit is this valid
	@CCodeTemplate(value = "UINTPTR_MAX", includes = stdint)
	@NotNull
	public static final uintptr_t UINTPTR_MAX = UINT64_MAX.cast(uintptr_t.class);

	@CCodeTemplate(Scalar)
	public uintptr_t(final long value)
	{
		super(value);
	}

	@NotNull
	@Override
	protected uintptr_t constructT(@SuppressWarnings("ParameterHidesMemberVariable") final long value)
	{
		return new uintptr_t(value);
	}

	@SuppressWarnings("CovariantEquals")
	@Override
	public boolean equal(@NotNull final uintptr_t right)
	{
		return super.equals(right);
	}

	@Override
	public boolean notEqual(@NotNull final uintptr_t right)
	{
		return super.notEquals(right);
	}

	@Override
	public boolean greaterThan(@NotNull final uintptr_t right)
	{
		return super.greaterThan(right);
	}

	@Override
	public boolean lessThan(@NotNull final uintptr_t right)
	{
		return super.lessThan(right);
	}

	@Override
	public boolean greaterThanOrEqualTo(@NotNull final uintptr_t right)
	{
		return super.greaterThanOrEqualTo(right);
	}

	@Override
	public boolean lessThanOrEqualTo(@NotNull final uintptr_t right)
	{
		return super.lessThanOrEqualTo(right);
	}

	@NotNull
	@Override
	public uintptr_t add(@NotNull final uintptr_t right)
	{
		return super.add(right);
	}

	@NotNull
	@Override
	public uintptr_t subtract(@NotNull final uintptr_t right)
	{
		return super.subtract(right);
	}

	@NotNull
	@Override
	public uintptr_t multiply(@NotNull final uintptr_t right)
	{
		return super.multiply(right);
	}

	@NotNull
	@Override
	public uintptr_t divide(@NotNull final uintptr_t right)
	{
		return super.divide(right);
	}

	@NotNull
	@Override
	public uintptr_t modulus(@NotNull final uintptr_t right)
	{
		return super.modulus(right);
	}

	@Override
	public uintptr_t and(@NotNull final uintptr_t right)
	{
		return super.and(right);
	}

	@Override
	public uintptr_t or(@NotNull final uintptr_t right)
	{
		return super.or(right);
	}
}
