package org.ictclas4j.bean;



public class WordItem {
	private String word;
	private int len;  //词的字节长度
	private int handle;// 句柄，用来标识词的词性
	private int freq;// 频度，用来说明该词出现在语料库中的次数或概率
	
	WordItem() {
		
	}
	
	WordItem(String _word,int _len,int _handle,int _freq) {
		word=_word;
		len=_len;
		handle=_handle;
		freq=_freq;
	}
	
	public int getFreq() {
		return freq;
	}

	public void setFreq(int frequency) {
		this.freq = frequency;
	}

	public int getHandle() {
		return handle;
	}

	public void setHandle(int handle) {
		this.handle = handle;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
}
