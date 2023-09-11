class StringCalculator
  
  def self.add(input)
    0    
  end

  def self.addTwo(input)
    if input.empty?
      0
    else
      input.to_i
    end
  end

  def self.addThree(input)
    if input.empty?
      0
    else
      numbers = input.split(",").map { |num| num.to_i }
      numbers.inject(0) { |sum, number| sum + number }
    end
  end
end