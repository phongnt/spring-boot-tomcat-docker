package com.github.phongnt.mvc;

public interface ICaptchaService {
    void processResponse(final String response) throws ReCaptchaInvalidException;
}
