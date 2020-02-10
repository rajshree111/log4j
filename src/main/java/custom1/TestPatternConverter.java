package custom1;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
import org.apache.logging.log4j.core.pattern.PatternConverter;

@Plugin(name = "TestPatternConverter", category = PatternConverter.CATEGORY)
@ConverterKeys({"e"})
public final class TestPatternConverter extends LogEventPatternConverter{
	
	/**
     * Private constructor.
     * @param options options, may be null.
     */
    private TestPatternConverter(final String[] options) {
        super("Flagg", "flagg");
    }

    /**
     * Obtains an instance of pattern converter.
     *
     * @param options options, may be null.
     * @return instance of pattern converter.
     */
    public static TestPatternConverter newInstance(final String[] options) {
        return new TestPatternConverter(options);
    }
    
    /**
     * {@inheritDoc}
     */
//    @Override
//    public void format(final LogEvent event, final StringBuilder toAppendTo) {
//        
//    }

	@Override
	public void format(LogEvent event, StringBuilder toAppendTo) {
		// TODO Auto-generated method stub
		String flagg = "@@@@@@@@@@@22222";
		
		if(event.getLevel().toString().equalsIgnoreCase("error")) {
			
			System.out.println("################33"+event.getLevel());
			flagg = "-1";
			
		}
//        if(TestLogHandler.isTestLogEnabled()) {
//            TestContextHolder contextHolder = TestLogHandler.getLatestContextHolderFromStack(event.getThreadName());
//            if(contextHolder != null) {
//                flagg = contextHolder.getflaggForThread(event.getThreadName());
//            }
//            else{
//                flagg = TestContextHolder.getflaggForThread(event.getThreadName());
//            }
//        }
        toAppendTo.append(flagg);
		
	}

}
