package testing;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public class NiceAppendable
{
	private static final CharSequence NL = "\n";
	private final Appendable out;

	public NiceAppendable(final Appendable out)
	{
		this.out = out;
	}

	public NiceAppendable append(final CharSequence csq)
	{
		try
		{
			out.append(csq);
			tryFlush();
			return this;
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public NiceAppendable append(final CharSequence csq, final int start, final int end)
	{
		try
		{
			out.append(csq, start, end);
			tryFlush();
			return this;
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public NiceAppendable append(final char c)
	{
		try
		{
			out.append(c);
			tryFlush();
			return this;
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public NiceAppendable println()
	{
		return append(NL);
	}

	public NiceAppendable println(final CharSequence csq)
	{
		try
		{
			StringBuilder buffer = new StringBuilder();
			buffer.append(csq);
			buffer.append(NL);
			out.append(buffer.toString());
			tryFlush();
			return this;
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public void close()
	{
		try
		{
			tryFlush();
			if (out instanceof Closeable)
			{
				((Closeable) out).close();
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	private void tryFlush()
	{
		if (!(out instanceof Flushable))
		{
			return;
		}
		try
		{
			((Flushable) out).flush();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}
}
