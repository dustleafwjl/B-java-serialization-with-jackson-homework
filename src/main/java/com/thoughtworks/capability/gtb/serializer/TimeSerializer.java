package com.thoughtworks.capability.gtb.serializer;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Date;


@Slf4j
public class TimeSerializer extends StdSerializer<Date> {

    protected TimeSerializer() {
        super(Date.class);
    }

    @Override
    public void serialize(Date date, JsonGenerator gen, SerializerProvider provider) throws IOException {
        log.info("demomo");
        gen.writeNumber(date.getTime());
    }
}